package com.vinculum.ondc.constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * The Constants class provides a set of constant values used in the ONDC application.
 * These constants include application settings, database IDs, query strings, error messages,
 * request types, URLs, and other miscellaneous values.
 * <p>
 * The class is final and cannot be instantiated, as it serves as a repository for constant values only.
 * All members of the class are public and static, allowing easy access to the defined constants.
 * </p>
 *
 * @since 1.0
 */

public final class Constants {

	private Constants() {
		super();
	}
	public static final String APP_ID="ONDC";
	public static final String ENVIRONMENT="env";
	public static final String ON = "ON";
	public static final int MAX_RETRY_COUNT = 3;
	public static final int MAX_THREAD_IN_POOL = 5;
	public static final String GLOBAL_DB_ID = "001";
	public static final String INTEGRATION_DB_ID = "002";
	public static final String POSTGRES_DB_ID="003";
	public static final CharSequence QUESTION = "?";
	public static final String SPACE = " ";
	public static final String BLANK = "";
	public static final String F_SLASH = "/";
	public static final String KEY_VAL= "Key: %s Value %s";
	public static final String PIPE = "|";
	public static final String BAR = "---------------------------------------------------------------------------------------";
	public static final String CROSS = "XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
	public static final String UNIQUE = "uniqueid";
	public static final String SYSTEM = "system";
	public static final String MAIN = "MAIN";
	public static final String STORE = "STORE";
	public static final String EVICTION = "HTTP_EVICTION";
	public static final String MEMORY = "MEMORY";
	public static final String UNDERSCORE = "_";
	public static final String TRANSACTION_MANAGER = "transactionManager";
	public static final String SQL_SESSION = "sqlSession";
	public static final String SHOW_DB = "SELECT * FROM CUSTOMER_DB_CONFIG WHERE APPID='ONDC' AND ACTIVE=1 ORDER BY DBID";
	public static final String SHOW_POSTGRES_DB = "SELECT * FROM ONDCMETADATA";
	
	public static final String COUNT_QUERY = "SELECT COUNT(*) FROM ALERTSUBSCRIPTION";
	public static final String DB_IDS = "dbIds";
	public static final String HEADER = "DATABASE NAME                 \tRESULT                 \tDBID";
	public static final String BODY = "%s\t%s\t                 %s";
	public static final String TIMEZONES_LOADING = "                Loaded Time Zones                                  ";
	public static final String LOADED_ZONES = "%s\t\t%s";
	public static final String HASH = "#############################################################################";
	public static final String FAILURE_MESSAGE = "FAILURE";
	public static final String SUCCESS_MESSAGE = "SUCCESS";
	public static final Map<String, Map<String,String>> META = new ConcurrentHashMap<>();
	public static final String EXECUTORS = "executors";
	public static final String REQUEST = "Request: %s";
	public static final int NINE = 9;
	public static final int SE_1001 = 1001;
	public static final int SE_1002 = 1002;	
	public static final int SE_1003 = 1003;
	public static final int SE_1004 = 1004;
	public static final int SE_1005 = 9999;
	public static final int SE_111 = 111;
	public static final int SE_1111 = 1111;
	public static final String NO_AWS_CLIENT_FOUND = "No AWS Secrets Manager Client Derived For Secret Key %s. Please Connect to the Server Administrator.";
	public static final String NO_REQUEST_FOUND = "No Secret Request Created with Secret Key %s. Please Connect with the Server Adminitrator.";
	public static final String NO_RESULT_FOUND = "No Secret Result Found with Secret Key %s. Please Connect with the Server Adminitrator.";
	public static final String EXCEPTION_UNKNOWN = "Unwanted Exception Occured for Secret Key %s . Please Connect With the Server Administrator.";
	public static final String NO_SDK_META_DATA_FOUND = "Error in Getting HTTP Status from AWS. Please Connect with the Server Adminitrator.";
	public static final String STATUS_CODE_NOT_ACCEPTED = "Status Code is : %s While Calling the AWS API";
	public static final String AWS_VALUE_IS_NULL = "For SecretKey %s, there is No JSON Value Configured in AWS. Create the Secret using The Creation API first.";
	public static final String CONVERSION_NOT_FOUND = "For Secret Key %s, We were unable to Convert the Secret Values JSON to a Properties Map. Please Connect to the Service Administrator.";
	public static final String AWS_SECRET_GET_PROCESS_START= "Start GET PROCESS for Get Secret Value API";
	public static final String AWS_SECRET_GET_PROCESS_END= "End GET PROCESS for Get Secret Value API";
	public static final String AWS_GET_CALL_START = "Start API Call: AWS Get Secret Value API";
	public static final String AWS_GET_CALL_END = "End API Call: AWS Get Secret Value API";
	public static final String AWS_MAP_CONVERT_START = "Start to Convert AWS Get Secret Value to Properties Map";
	public static final String AWS_MAP_CONVERT_END = "End to Convert AWS Get Secret Value to Properties Map";
	public static final String PRODUCTS = "products";
	public static final String ORDERS = "orders";
	public static final String CONFIRM  = "confirm";
	public static final int DEFAULT_STATUS = 0;
	
	public static final String CREATE_INDICE_REQ_NULL = "Create Indice Request: The Request for Creating an Index %s is Null";
	public static final String CREATE_INDICE_DATA_NULL = "Create Indice Request: The Request Json is Empty or The index Name is Invalid %s ";
	public static final String CREATE_DATA_REQ_NULL = "Create Data Request: The Data for Creation is Null for Index Name %s";
	public static final String CREATE_DATA_REQ_OBJ_NULL = "Create Data Request: The Request Object is Null for Index Name %s";
	public static final String OK = "OK";
	public static final String RETRIEVE_REQUEST_NULL = "Get Data Request Is Null for Index %s";
	public static final String RETRIEVE_RESPONSE_NULL = "Get Data Response Is Null For Index %s";
	public static final String RETRIEVE_RESPONSE_META_NULL = "Get Data Response Metadata is Null For Index %s";
	public static final String RETRIEVE_RESPONSE_HITS_NULL = "Hits Gotten from Metadata is Null For Index %s";
	public static final String PRODUCTS_PROCESS_ACTIVITY = "PRODUCTS_PROCESS";
	public static final String SCHEDULER_SKU_PROCESS = "PRODUCTS_PROCESS_%s";
	public static final String ELASTIC_SEARCH_SKU_PROCESS_INTCODE = "ESEARCH_SKU";
	public static final String BULK_RESPONSE_ITEM_NULL = "List of Bulk Response Item is Null for IndexName %s";
	public static final String TO_UPSERT = "TO_UPSERT";
	public static final String TO_DELETE = "TO_DELETE";
	public static final String TOTAL_UPSERT = "Total SKUs to Upsert: %s";
	public static final String TOTAL_DELETE = "Total SKUs to Delete: %s";
	public static final String GOLA = "000000000000000000000000000000000000000000000000000000000000000000000000000000000";
	public static final String LOG_START = "Start SKU Processing For DbId %s  Time %s";
	public static final String LOG_END = "End SKU Processing For DbId %s  Time %s";
	public static final DateFormat FORMATTER_TIME = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final String NO_DATA = "No Data Found %s For DB ID: %s";
	public static final String SKU = "skuname";
	public static final String ITEM_DESCRIPTOR = "item_descriptor";
	public static final String STATUS = "status";
	public static final String H_CREATE = "HEADER AND BODY PASSED IN GET SKUS REQUEST";
	public static final String H_I_CREATE = "HEADER AND BODY PASSED IN CREATE INDICE REQUEST";
	public static final String GET_SKU_RESPONSE = "GET SKU RESPONSE: ";
	public static final String GET_SEARCH_RESPONSE = "GET SKU RESPONSE: ";
	public static final String CREATE_INDEX_RESPONSE = "CREATE INDEX RESPONSE: ";
	public static final int SUCCESS_CODE=1;
	public static final int FAILURE_CODE=9;
	public static final String ERR_002 = "Record Not Processed. Please Ask Administrator Of The API To Check.";
	public static final String REQ_TYPE_GET_SKUS = "GET_PRODUCTS";
	public static final String REQ_TYPE_SEARCH = "SEARCH";
	public static final String REQ_TYPE_SELECT = "SELECT";
	public static final String REQ_TYPE_INIT = "INIT";
	public static final String REQ_TYPE_CONFIRM = "CONFIRM";
	public static final String REQ_TYPE_CREATE_INDEX = "CREATE_INDEX";
	public static final String REQ_TYPE_CREATE_PRODUCTS_INDEX = "CREATE_INDEX_PRODUCTS";
	public static final String REQ_TYPE_CREATE_ORDER_INDEX = "CREATE_INDEX_ORDERS";
	
	public static final String CREATED = "created";
	public static final String PROCESSING = "Processing Request..";
	public static final String CUSTOMERS="CUSTOMERS_%s";
	public static final String SKU_MDC = "%s";
	public static final String EVENTS = "events";
	public static final String SCHEDULERS = "schedulers";
	public static final String RESPONSE_ITEM_UNEXPECTED_ERROR = "Bulk Upsert Object Received indicates Unexpected Errors. Please Connect with the Service Administrator.";
	public static final Map<String, String> ACCESS = new ConcurrentHashMap<>();
	
	
	public static final String POSTGRES_USER="postgres";
	public static final String POSTGRES_PASSWORD="root";
	public static final String POSTGRES_URL="jdbc:postgresql://localhost:5432/ondc";
	public static final String POSTGRES_DRIVER="org.postgresql.Driver";
	public static final String SEARCH="SEARCH";
	public static final String SELECT="SELECT";
	public static final String INIT="INIT";
	public static final String CATEGORY="category";
	public static final String LOCATION="location";
	public static final String AREA_CODE="area_code";
	public static final String CITY="city";
	public static final String ACKNOWLEDGE_SUCCESS="ACK";
	public static final String ACKNOWLEDGE_FALIURE="NACK";
	public static final String BLAKE2B_512="BLAKE2B-512";
	public static final String LOOKUP_ENDPOINT = "https://pilot-gateway-1.beckn.nsdl.co.in/lookup";
	
	/** vinculum private key **/
	public static final String PRIVATE_KEY="lTKY44iTfKqtxDdiWgDpMAgSQNKkVVhV49/6InrFCjfWILTUxzi5HOl7oFnrM0P5iSI6EVNVSk2EKNsGJ8uiIQ==";
	public static final String DASH = "-";
	public static final String ERR_004 = "Status Line Is Null While Calling Integration Server";
	public static final String ERR_005 = "Integration Server Failed To Respond";
	public static final String ERR_30019 ="30019";
	public static final String ERR_006 = "There Is Casting Issue. System Was Trying To Cast Response Body From Token Response To POJO. Casting Returned Null.";
	public static final String ERR_007 = "Response Status From Token Response Is Null Or Blank. Please Do Check For The Same.";
	public static final String ERR_008 = "Response Body From Toke Request Is Blank Or Null.";
	public static final String ERR_009 = "Invalid Value In JSON Property activity. Please Check The Submitted Request.";
	public static final String ERR_012 = "Base URL Not Configured For This DB ID: %s";
	public static final String CONTENT_TYPE = "Content-Type";
	public static final String AUTH = "Authorization";
	public static final String ACCEPT = "accept";
	public static final String ERR_010 = "Meta Data Not Configured For This DB ID: %s";
	public static final String POST = "POST";
	public static final String PUT = "PUT";
	public static final String URL="https://pilot-gateway-1.beckn.nsdl.co.in/on_search";
	public static final String ONDC_SEARCH_ENDPOINT="http://localhost:9045/ondc/search";
	public static final String ONDC_ON_SEARCH_ENDPOINT="http://localhost:9045/ondc/onsearch";
	public static final String ONDC_ON_INIT_ENDPOINT="http://localhost:9045/ondc/oninit";
	public static final String UK_ID="ukId";
	public static final String SIGNING_PUBLIC_KEY="signing_public_key";
	public static final String ON_SEARCH="on_search";
	public static final String ONDC_ON_SELECT_ENDPOINT = "http://localhost:9045/ondc/onselect";
	public static final String ONDC_ON_CONFIRM_ENDPOINT = "https://demo.vineretail.com/RestWS/api/eretail/v1/order/create";
	public static final String ONDC_ON_CANCEL_ENDPOINT = "http://localhost:9045/ondc/oncancel";
	public static final String Locations="location";
	public static final String ITEM="item";
	public static final String QUANTITY="quantity";
	public static final String ERR_001 = "Value Supplied In Field client_uuid: %s Is Invalid. Ether This Is Not Available Or Not Active.";
	public static final String ITEM_CATEGORY_ID = "item_category_id";
	public static final String DOMAIN = "domain";
	
	public static final String ONDC_RET10 = "ONDC:RET101";
	public static final String ONDC_RET11 = "ONDC:RET11";
	public static final String ONDC_RET12 = "ONDC:RET12";
	public static final String ONDC_RET13 = "ONDC:RET13";
	public static final String ONDC_RET14 = "ONDC:RET14";
	public static final String ONDC_RET15 = "ONDC:RET15";
	public static final String ONDC_RET16 = "ONDC:RET16";
	public static final String ONDC_RET17 = "ONDC:RET17";
	public static final String ONDC_RET18 = "ONDC:RET18";
	public static final String ONDC_RET19 = "ONDC:RET19";
	public static final String ON_SELECT = "on_select";
	public static final String ON_INIT ="on_init";
	public static final String CANCEL="CANCEL";
	public static final String PENDING="PENDING";
	public static final String CONFIRMED="CONFIRMED";
    public static final int MAX_RETRIES = 3;
    public static final int CUSTOM_ERROR_CODE_25001 = 25001;
    public static final int CUSTOM_ERROR_CODE_30019 = 30019;
	

	public static final String REQ_TYPE_CANCEL = "CANCEL";
	public static final long RETRY_INTERVAL_MILLIS = 3000;
	
	
}
