package com.vinculum.ondc.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.constants.Constants;

/**
 *
 * @author Manish Anand
 *
 * This is the utility class.
 *
 */
public class Util {
	/**
	 * Blank Checker
	 * @param data
	 * @return
	 */
	public String check(final String data){
		String result = null;
		if(StringUtils.isNotBlank(data)){
			result = StringUtils.trim(data);
		}
		return result;
	}

	/**
	 * This method is responsible for converting the given bytes to human
	 * readable format.
	 *
	 * @param bytes
	 * @param si
	 * @return
	 */
	public static synchronized String humanReadableByteCount(final long bytes, final boolean si) {
		final int unit = si ? 1000 : 1024;
		if (bytes < unit) {
			return bytes + " B";
		}
		final int exp = (int) (Math.log(bytes) / Math.log(unit));
		final String pre = (si ? "kMGTPE" : "KMGTPE").charAt(exp-1) + (si ? "" : "i");
		return String.format("%.1f %sB", bytes / Math.pow(unit, exp), pre);
	}

	public static synchronized void memory(final Class<?> clazz){
		//Create a String Builder
		final StringBuilder builder = new StringBuilder();
		//Append the total Memory
		builder.append(String.format("Total Memory - %s",Util.humanReadableByteCount(Runtime.getRuntime().totalMemory(), true))).append(Constants.PIPE);
		//Append The Free Memory
		builder.append(String.format("Free Memory - %s",Util.humanReadableByteCount(Runtime.getRuntime().freeMemory(), true))).append(Constants.PIPE);
		//Append The Used Memory
		builder.append(String.format("Used Memory - %s",Util.humanReadableByteCount(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory(), true))).append(Constants.PIPE);
		//Append The Max Memory
		builder.append(String.format("Max Memory - %s",Util.humanReadableByteCount(Runtime.getRuntime().maxMemory(), true)));
		//Create the Logger
		final Logger logger = LoggerFactory.getLogger(clazz);
		//Log the memory utilization
		logger.info(String.format("MEMORY: %s", builder.toString()));
	}

	public static String getDBName(final String dbUrl){
		//Declare the DB NAME
		String dbName = null;
		//Get the Last Index Of Forward Slash
		final int start = StringUtils.lastIndexOf(dbUrl, Constants.F_SLASH);
		//Get the Index Of Question Mark
		final int end = StringUtils.lastIndexOf(dbUrl, Constants.QUESTION);
		//Substring from start Till End
		dbName = StringUtils.substring(dbUrl, start+1, end);
		//Return the DB NAME
		return dbName;
	}

	public static String format(final String database, final String organization){
		//Declare the DB NAME
		String dbName = database;
		//Check If Length Is Greater Then 30 In That Case Truncate Up To 30
		if(StringUtils.length(database) >= 30){
			//Truncate
			dbName = StringUtils.substring(database, 0, 30);
		}else if(StringUtils.length(database) < 30){
			//If Length is less then 30 Pad till 30
			dbName = StringUtils.rightPad(database,30,Constants.SPACE);
		}

		//Assign the Organization ID
		String orgId = organization;
		//Check if length is greater then 20
		if(StringUtils.length(organization) >= 20){
			//Truncate till 15
			orgId = StringUtils.substring(organization, 0, 20);
		}else if(StringUtils.length(organization) < 20){
			//Pad if organization ID is less then 20
			orgId = StringUtils.rightPad(organization,20,Constants.SPACE);
		}

		//Return the formatted String
		return String.format(Constants.BODY, StringUtils.upperCase(dbName),StringUtils.upperCase(orgId));
	}

	public static String formated(final String database, final String result, final String dbId){
		//Declare the DB NAME
		String dbName = database;
		//Check If Length Is Greater Then 30 In That Case Truncate Up To 30
		if(StringUtils.length(database) >= 30){
			//Truncate
			dbName = StringUtils.substring(database, 0, 30);
		}else if(StringUtils.length(database) < 30){
			//If Length is less then 30 Pad till 30
			dbName = StringUtils.rightPad(database,30,Constants.SPACE);
		}
		//Return the formatted String
		return String.format(Constants.BODY, StringUtils.upperCase(dbName),StringUtils.upperCase(result), dbId);
	}

	/**
	 * This method is responsible for giving back the Alias name of the database
	 * against a DB URL.
	 *
	 * @param dbUrl
	 * @return
	 */
	public static String getDBAlias(final String dbUrl){
		String alias = null;
		if(StringUtils.isNotBlank(dbUrl)){
			final int index = StringUtils.lastIndexOf(dbUrl, Constants.F_SLASH)+1;
			final int end = StringUtils.lastIndexOf(dbUrl, Constants.QUESTION);
			alias = StringUtils.substring(dbUrl, index, end);
		}
		return StringUtils.trim(StringUtils.upperCase(alias));
	}

	public static Date zoneDateToDateConvert(Date date, String sourceTimeZone, String destinationTimeZone) {
		// Null check
		if (date == null) {
			//Return null
			return null;
		}
		//Calculate the from Time Zone
		final ZoneId fromTimeZone = ZoneId.of(sourceTimeZone);
		//Calculate the To Time Zone
		final ZoneId toTimeZone = ZoneId.of(destinationTimeZone);
		final LocalDateTime source = date.toInstant().atZone(toTimeZone).toLocalDateTime();
		//Zoned date time at source timezone
		final ZonedDateTime sourceTime = source.atZone(fromTimeZone);
		//Zoned date time at source timezone
		final ZonedDateTime currentSystem = sourceTime.withZoneSameInstant(toTimeZone);
		//Return
		return Date.from(currentSystem.toInstant());
	}

	public static Date stringToDate(final String input, final String format,  final Logger logger) {
		//Create Result
		Date result = null;
		//Handle Exception
		try {
			//Create The Date Format
			final DateFormat formatter = new SimpleDateFormat(format);
			//Parse
			result = formatter.parse(StringUtils.trim(input));
		}catch(final Exception exception) {
			//Log
			logger.info(exception.getMessage(),exception.fillInStackTrace());
		}

		//Return
		return result;
	}

	public static String dateToString(final Date input, final String format,  final Logger logger) {
		//Create Result
		String result = null;
		//Handle Exception
		try {
			//Create The Date Format
			final DateFormat formatter = new SimpleDateFormat(format);
			//Parse
			result = formatter.format(input);
		}catch(final Exception exception) {
			//Log
			logger.info(exception.getMessage(),exception.fillInStackTrace());
		}

		//Return
		return result;
	}
	public static String replaceNullWithEmpty(String input){
		return input.replaceAll("null,", "\"\",");
	}
	public static String now() {
		return Constants.FORMATTER_TIME.format(new Date());
	}

}
