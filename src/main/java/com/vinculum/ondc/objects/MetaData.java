package com.vinculum.ondc.objects;


import java.util.List;
import java.util.Map;

import org.apache.http.HttpHost;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.elasticsearch.client.RestClient;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Lazy;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.vinculum.ondc.AppConfig;
//import com.vinculum.ondc.dao.objects.lookups.Access;

import co.elastic.clients.elasticsearch.ElasticsearchAsyncClient;
import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import co.elastic.clients.transport.rest_client.RestClientTransport;

@Service

public class MetaData {
    /**
     * The logger instance for logging purposes.
    */
	public static final Logger LOGGER = LoggerFactory.getLogger(MetaData.class);
	
	
	@Autowired
	@Lazy
	private SqlSessionTemplate session;
	
	@Autowired
	@Lazy
	private PlatformTransactionManager manager;
	@Autowired
	@Lazy
	private PoolingHttpClientConnectionManager connmanager;
	@Autowired
	@Lazy
	private ObjectMapper objectMapper;
	
	@Autowired
	@Lazy
	private ElasticsearchClient elasticClient;  
	
	@Autowired
	@Lazy
	private Map<String, DriverManagerDataSource> datasources;
	
	@Autowired
	@Lazy
	private ElasticsearchAsyncClient elasticAsyncClient;
	//@Autowired
	//@Lazy
	//private List<Access> infos;
	
	@Autowired
	@Lazy
	private Map<String, Object> context;
	
	
	
	public void init() {
		LOGGER.info("Initializing All Elastic Search Client..");
		
		elasticClient = getElasticClient();

		elasticAsyncClient = getElasticAsyncClient();
		
		LOGGER.info("All Elastic Search Client Initialized..");
	}

	
	@Bean	
	public SqlSessionTemplate getSession() {
		return session;
	}
	public void setSession(SqlSessionTemplate session) {
		this.session = session;
	}
	
	@Bean
	public PlatformTransactionManager getManager() {
		return manager;
	}
	
	public void setManager(PlatformTransactionManager manager) {
		this.manager = manager;
	}
	@Bean
	public PoolingHttpClientConnectionManager getConnmanager() {
		return connmanager;
	}
	public void setConnmanager(PoolingHttpClientConnectionManager connmanager) {
		this.connmanager = connmanager;
	}
	@Bean
	public ObjectMapper getObjectMapper() {
		return objectMapper;
		// return new ObjectMapper();
	}
	/*
	public void setObjectMapper(ObjectMapper mapper) {
		this.objectMapper = mapper;
		
	}*/
	/*@Bean
	public ElasticsearchClient getElasticsearchClient() {
		return elasticsearchClient;
	}
	public void setElasticsearchClient(ElasticsearchClient elasticsearchClient) {
		this.elasticsearchClient = elasticsearchClient;
	}*/
	@Bean
	public Map<String, DriverManagerDataSource> getDatasources() {
		return datasources;
	}
	public void setDatasources(Map<String, DriverManagerDataSource> datasources) {
		this.datasources = datasources;
	}
	
	/*public ElasticsearchAsyncClient getElasticsearchAsyncClient() {
		return elasticsearchAsyncClient;
	}
	public void setElasticsearchAsyncClient(ElasticsearchAsyncClient elasticsearchAsyncClient) {
		this.elasticsearchAsyncClient = elasticsearchAsyncClient;
	}*/
	
	/*@Bean
	public List<Access> getInfos() {
		return infos;
	}
	public void setInfos(List<Access> infos) {
		this.infos = infos;
	}*/
	@Bean
	public Map<String, Object> getContext() {
		return context;
	}
	public void setContext(Map<String, Object> context) {
		this.context = context;
	}
	
	public HttpHost getHost() {
		return new HttpHost("127.0.0.1",9200);
	}

	public RestClient getRestClient() {
		return RestClient.builder(getHost()).build();
	}

	public RestClientTransport getTransport() {
		return new RestClientTransport(getRestClient(), new JacksonJsonpMapper());
	}
	@Bean
	public ElasticsearchClient getElasticClient() {
		return new ElasticsearchClient(getTransport());
	}
	@Bean
	public ElasticsearchAsyncClient getElasticAsyncClient() {
		return new ElasticsearchAsyncClient(getTransport());
	}



}
