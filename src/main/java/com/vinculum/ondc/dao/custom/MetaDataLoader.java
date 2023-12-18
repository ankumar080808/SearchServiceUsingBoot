package com.vinculum.ondc.dao.custom;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.apache.commons.lang3.StringUtils;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.vinculum.ondc.business.Transactional;
import com.vinculum.ondc.constants.Constants;
import com.vinculum.ondc.dao.datasource.CustomerContextHolder;
import com.vinculum.ondc.dao.iface.LookupsDao;
import com.vinculum.ondc.dao.objects.lookups.Access;
import com.vinculum.ondc.dao.objects.lookups.ClientMaster;


/**
 *
 * @author Manish Anand
 *
 * This class is responsible for loading some static
 * as well as dynamic data from the data base.
 *
 */
public class MetaDataLoader extends Transactional {

	public static final Logger LOGGER = LoggerFactory.getLogger(MetaDataLoader.class);

	private SqlSessionTemplate sqlSession;
	
	
	public void setSqlSession(final SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	public SqlSessionTemplate getSqlSession() {
		return sqlSession;
	}


	public List<ClientMaster> getClientMaster(String dbId) {
		//Point to the DB for the given customer.
		CustomerContextHolder.setCustomerType(dbId);
		List<ClientMaster> result = new ArrayList<>();
		try{
			//Begin Transaction
			begin();
			//Get the Lookup DAO from the SQL Session
			final LookupsDao dao = sqlSession.getMapper(LookupsDao.class);
			//Get the count
			result = dao.getClientMaster();
			//Commit Transaction
			commit();
		}catch(final Exception exception){
			//Rollback
			rollback();
			//Log the exception
			LOGGER.error(exception.getMessage(),exception.fillInStackTrace());
		}finally{
			//Clear the context
			CustomerContextHolder.clearCustomerType();
		}
		return result;

	}

	public ClientMaster getClient(final String dbId, final String extClientCode) {
		//Create the result to be returned
		ClientMaster result = null;
		//Point to the DB for the given customer.
		CustomerContextHolder.setCustomerType(dbId);
		try{
			//Begin Transaction
			begin();
			//Get the Lookup DAO from the SQL Session
			final LookupsDao dao = sqlSession.getMapper(LookupsDao.class);
			//Get the count
			final List<ClientMaster> masters =  dao.getClient(extClientCode);
			//Check
			if(null !=masters && !masters.isEmpty()) {
				//Assign
				result = masters.get(0);
			}
			//Commit Transaction
			commit();
		}catch(final Exception exception){
			//Rollback
			rollback();
			//Log the exception
			LOGGER.error(exception.getMessage(),exception.fillInStackTrace());
		}finally{
			//Clear the context
			CustomerContextHolder.clearCustomerType();
		}
		return result;
	}
	
	public  List<Access>  populateMetaInfo(final String dbId) {
		//Point to t	he DB for the given customer.
		CustomerContextHolder.setCustomerType(Constants.POSTGRES_DB_ID);
		CustomerContextHolder.getCustomerType();
		List<Access> infos=new ArrayList<Access>();
		try{
			//Begin Transaction
			begin();
			//Get the Lookup DAO from the SQL Session
			final LookupsDao dao = sqlSession.getMapper(LookupsDao.class);
			//Get the count
			infos =  dao.getMetaInformation(Constants.POSTGRES_DB_ID);
			//Check
			if(null !=infos && !infos.isEmpty()) {
				
				
				//Loop Through The Records
				for(final Access access: infos) {
					//Get the Access
					final String code = StringUtils.trim(access.getUkid());
					//Check And Add
					if(null == Constants.ACCESS.get(code)) {
						//Put
						Constants.ACCESS.put(code, dbId);
					}
					
					//Get the map
					Map<String,String> meta = Constants.META.get(dbId);
					//Check null
					if(null == meta) {
						//Create New
						meta = new ConcurrentHashMap<String, String>();
						//Put The New Map To Meta
						Constants.META.put(dbId, meta);
					}
					//Put The Meta Information
					meta.put(StringUtils.trim(access.getType()), StringUtils.trim(access.getSigningPrivateKey()));
				}
			}
			//Commit Transaction
			commit();
			//LOG
			LOGGER.info(Constants.ACCESS.toString());
			//LOG
			LOGGER.info(Constants.META.toString());
		}catch(final Exception exception){
			//Rollback
			rollback();
			//Log the exception
			LOGGER.error(exception.getMessage(),exception.fillInStackTrace());
		}finally{
			//Clear the context
			CustomerContextHolder.clearCustomerType();
			
		}
		return infos;
	}

	
}
