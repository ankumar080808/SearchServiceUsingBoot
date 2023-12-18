package com.vinculum.ondc.dao.adapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;

import com.mysql.jdbc.Driver;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.datasource.CustomerRoutingDataSource;

/**
 * The AdaptiveDBConfigrator class is responsible for configuring the database connections dynamically based on the retrieved databases.
 * It implements the ApplicationContextAware interface to gain access to the application context.
 * 
 * The class includes various instance variables that store the database connection details, such as dbUrl, params, user, password, global, driver, aliasPackage, configLocation, and mapperLocation.
 * 
 * The init() method initializes the database connections by retrieving the databases and setting up the necessary data sources, transaction managers, and session factories.
 * 
 * The addGlobalDb() method adds the global database and a predefined PostgreSQL database to the list of data sources.
 * 
 * The setApplicationContext() method is implemented from the ApplicationContextAware interface and sets the application context.
 * 
 * Overall, the AdaptiveDBConfigrator class provides the functionality to dynamically configure and manage database connections for the application.
 */

@Service
public class AdaptiveDBConfigrator implements ApplicationContextAware{
	/**
	 * Logger for this class.
	 */
	public static final Logger LOGGER = LoggerFactory.getLogger(AdaptiveDBConfigrator.class);
	//Create the DB URL
	private String dbUrl;
	//Create the params
	private String params;
	//Create the DB User
	private String user;
	//Create the password
	private String password;
	//Global DB Name
	private String global;
	//Database Driver
	private String driver;
	//Alias Package
	private String aliasPackage;
	//Config Location
	private String configLocation;
	//Mapper Location
	private String mapperLocation;
	//The Application Context
	private ApplicationContext context;
	
	//The init method
	public void init(){
		//Create connection
		Connection connection = null;
		//Create statement
		Statement statement = null;
		//Create Result Set
		ResultSet resultSet = null;
		//Handle Exception
		try{
			//Register The Driver
			DriverManager.registerDriver(new Driver());
			//Initialize the Connection
			connection = DriverManager.getConnection(dbUrl + global + params,user,password);
			//Initialize the statement
			statement = connection.createStatement();
			//Execute the SQL
			
			 resultSet = statement.executeQuery(Constants.SHOW_DB);
		
			
			//Create the Map
			final Map<Object,Object> datasources = new LinkedHashMap<Object,Object>();
			//Check null
			if(null != resultSet){
				//Create the Verifier Object
				final AdaptiveDBVerifier verifier = new AdaptiveDBVerifier();
				//Log the BAR
				AdaptiveDBVerifier.LOGGER.info(Constants.BAR);
				//Log the Header
				AdaptiveDBVerifier.LOGGER.info(Constants.HEADER);
				//Log the BAR
				AdaptiveDBVerifier.LOGGER.info(Constants.BAR);
				//Loop
				while(resultSet.next()){
					//Get the database name
					final String schema = resultSet.getString(1);
					//Get the DB ID
					final String dbId = resultSet.getString(3);
					//Get the DB URL
					final String dbUrl = resultSet.getString(5);

					//Check if this DB is Good
					if(verifier.verify(dbUrl, StringUtils.trim(schema), params, user, password, dbId)){
						//Create the URL
						final String url = dbUrl + StringUtils.trim(schema) + params;
						//Create the Data Source
						final DriverManagerDataSource datasource = new DriverManagerDataSource();
						//Set the user
						datasource.setUsername(user);
						//Set the password
						datasource.setPassword(password);
						//Set the URL
						datasource.setUrl(url);
						//Set the driver
						datasource.setDriverClassName(driver);
						//Check for none global database
						if(!StringUtils.equals(global, schema)){
							//Add the data source
							datasources.put(dbId, datasource);
						}
					}
				}
				//Add Global Database
				addGlobalDb(datasources);
			}
			//Log the BAR
			AdaptiveDBVerifier.LOGGER.info(Constants.BAR);
			//Log the information
			AdaptiveDBVerifier.LOGGER.info(String.format("Total Databases Added Including Global Database: %d", datasources.size()));
			//Log the BAR
			AdaptiveDBVerifier.LOGGER.info(Constants.BAR);
			//Get the bean factory
			final ConfigurableListableBeanFactory beanFactory = ((ConfigurableApplicationContext) context).getBeanFactory();
			//Check if data sources is not empty
			if(!datasources.isEmpty()){
				//Inject
				beanFactory.registerSingleton(Constants.DB_IDS, datasources);
				//Create the CustomerRoutingDataSource
				final CustomerRoutingDataSource router = new CustomerRoutingDataSource();
				
				
				//Set the default data source
				router.setDefaultTargetDataSource(datasources.get(Constants.GLOBAL_DB_ID));
				
				//Set the data sources
				router.setTargetDataSources(datasources);
				//After Property Set
				router.afterPropertiesSet();
				//Create the transaction manager
				final DataSourceTransactionManager manager = new DataSourceTransactionManager();
				//Set the data source to it
				manager.setDataSource(router);
				//Inject the transaction manager
				beanFactory.registerSingleton(Constants.TRANSACTION_MANAGER, manager);
				//Create the SqlSessionFactoryBean
				final SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
				//Set the data source
				factory.setDataSource(router);
				//Set the type alias package
				factory.setTypeAliasesPackage(aliasPackage);
				//Set the mapper location
				factory.setConfigLocation(context.getResource(configLocation));
				//Set the mapper location
				factory.setMapperLocations(context.getResources(mapperLocation));
				//After property set
				factory.afterPropertiesSet();
				//Create the sql session template
				final SqlSessionTemplate template = new SqlSessionTemplate(factory.getObject());
				//Inject
				beanFactory.registerSingleton(Constants.SQL_SESSION, template);
			}
		}catch(final Exception exception){
			//Log the Exception
			LOGGER.error(exception.getMessage(), exception.fillInStackTrace());
		}finally{
			//Handle Exception
			try{
				//Check null for resultSet
				if(null != resultSet){
					//Close the result set
					resultSet.close();
				}

				//Check Null for statement
				if(null != statement){
					//Close the statement
					statement.close();
				}

				//Check null for connection
				if(null != connection){
					//Close the connection
					connection.close();
				}
			}catch(final SQLException exception){
				//Log the Error
				LOGGER.error(exception.getMessage(),exception.fillInStackTrace());
			}
		}
	}

	private void addGlobalDb(final Map<Object,Object> datasources){
		//Create the URL
		final String url = dbUrl + global + params;
		//Create the Data Source
		final DriverManagerDataSource datasource = new DriverManagerDataSource();
		//Set the user
		datasource.setUsername(user);
		//Set the password
		datasource.setPassword(password);
		//Set the URL
		datasource.setUrl(url);
		//Set the driver
		datasource.setDriverClassName(driver);
		//Add the data source
		datasources.put(Constants.GLOBAL_DB_ID, datasource);
		
		final DriverManagerDataSource datasource2 = new DriverManagerDataSource();
		//Set the user
		datasource2.setUsername(Constants.POSTGRES_USER);
		//Set the password
		datasource2.setPassword(Constants.POSTGRES_PASSWORD);
		//Set the URL
		datasource2.setUrl(Constants.POSTGRES_URL);
		//Set the driver
		datasource2.setDriverClassName(Constants.POSTGRES_DRIVER);
		//Add the data source
		datasources.put(Constants.POSTGRES_DB_ID, datasource2);
		
	}
	


	@Override
	public void setApplicationContext(final ApplicationContext context) throws BeansException {
		this.context = context;
	}
	public void setDbUrl(final String dbUrl) {
		this.dbUrl = dbUrl;
	}
	public void setParams(final String params) {
		this.params = params;
	}
	public void setUser(final String user) {
		this.user = user;
	}
	public void setPassword(final String password) {
		this.password = password;
	}
	public void setGlobal(final String global) {
		this.global = global;
	}

	public void setDriver(final String driver) {
		this.driver = driver;
	}
	public void setAliasPackage(final String aliasPackage) {
		this.aliasPackage = aliasPackage;
	}
	public void setConfigLocation(final String configLocation) {
		this.configLocation = configLocation;
	}
	public void setMapperLocation(final String mapperLocation) {
		this.mapperLocation = mapperLocation;
	}
	
	
}
