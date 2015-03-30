package com.dao;



import java.io.IOException;
import java.io.Reader;

import com.ibatis.common.resources.Resources;
import com.ibatis.sqlmap.client.SqlMapClient;
import com.ibatis.sqlmap.client.SqlMapClientBuilder;

public class BaseDao {
	private  SqlMapClient client;
	
	public SqlMapClient  getClient(){
		String  resource = "SqlMapConfig.xml";
		try {
			Reader reader =  Resources.getResourceAsReader(resource);
			if(null==client){
				client = SqlMapClientBuilder.buildSqlMapClient(reader);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return client;
	}
}
