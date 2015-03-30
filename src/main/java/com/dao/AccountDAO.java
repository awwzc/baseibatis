package com.dao;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;




import com.dto.AccountCondition;
import com.dto.AccountDTO;

public interface AccountDAO {
	public  int add(AccountDTO dto)throws SQLException;
	public  AccountDTO findById(Integer id)throws SQLException;
	public  List<Map> findByMap(Map condition)throws SQLException;
	public  List<AccountDTO> findByCondition(AccountCondition condition)throws SQLException;
}
