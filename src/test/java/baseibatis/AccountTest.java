package baseibatis;

import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.dao.impl.AccountDAOImpl;
import com.dto.AccountCondition;
import com.dto.AccountDTO;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
	AccountDAOImpl dao = new AccountDAOImpl();
	public void testAdd() throws SQLException {
		
		AccountDTO dto = new AccountDTO();
		dto.setAccAge(new BigDecimal(10));
		dto.setAccBannerOption("test");
		dto.setAccCartOption(3);
		dto.setAccEmail("awwzc@sina.com");
		dto.setAccFirstName("li");
		dto.setAccLastName("wang");
		int id = dao.add(dto);
	}

	public void testFindById() throws SQLException {
		AccountDTO account =dao.findById(9); 
		System.out.println(account);
	}

	public void testFindByCondition() throws SQLException {
		AccountCondition condition = new AccountCondition();
		//condition.setAccFirstName("li");
		condition.setAccId(14);
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(10);
		ids.add(14);
		condition.setIds(ids);
		List<AccountDTO> list = dao.findByCondition(condition);
		System.out.println(list);
	}

}
