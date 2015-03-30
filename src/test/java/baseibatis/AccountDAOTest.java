package baseibatis;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import com.dao.impl.AccountDAOImpl;
import com.dto.AccountCondition;
import com.dto.AccountDTO;


public class AccountDAOTest  {
	Logger logger = Logger.getLogger(AccountDAOTest.class);
	public static void main(String[] args) throws SQLException {
		AccountDAOImpl dao = new AccountDAOImpl();
		AccountCondition condition = new AccountCondition();
		condition.setAccFirstName("li");
		condition.setAccId(14);
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(10);
		ids.add(14);
		condition.setIds(ids);
		List<AccountDTO> list = dao.findByCondition(condition);
		System.out.println(list);
	}

	public void addTest(){
		
	}
}
