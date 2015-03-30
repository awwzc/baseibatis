package com.dao.impl;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import baseibatis.AccountDAOTest;

import com.dao.AccountDAO;
import com.dao.BaseDao;
import com.dto.AccountCondition;
import com.dto.AccountDTO;

public class AccountDAOImpl  extends BaseDao  implements AccountDAO{
	//Logger logger = Logger.getLogger(AccountDAOImpl.class);
	private final String NAME_SPACE = "account.";
	public int add(AccountDTO dto) throws SQLException {
		
		return (Integer)getClient().insert(NAME_SPACE+"add", dto);
	}
	public AccountDTO findById(Integer id) throws SQLException {
		
		return (AccountDTO)this.getClient().queryForObject(NAME_SPACE+"findById", id);
	}
	@SuppressWarnings("unchecked")
	public List<Map> findByMap(Map condition) throws SQLException {
		
		return (List<Map>)this.getClient().queryForList(NAME_SPACE+"findByMap", condition);
	}
	public List<AccountDTO> findByCondition(AccountCondition condition)
			throws SQLException {
		
		return (List<AccountDTO>)this.getClient().queryForList(NAME_SPACE+"findByCondition", condition);
	}

}
