package com.dto;

import java.util.List;

public class AccountCondition {
	private  Integer  accId;
	private  String   accFirstName;
	private  List<Integer> ids;
	private  AccountDTO dto;
	public Integer getAccId() {
		return accId;
	}
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	public String getAccFirstName() {
		return accFirstName;
	}
	public void setAccFirstName(String accFirstName) {
		this.accFirstName = accFirstName;
	}
	public List<Integer> getIds() {
		return ids;
	}
	public void setIds(List<Integer> ids) {
		this.ids = ids;
	}
	public AccountDTO getDto() {
		return dto;
	}
	public void setDto(AccountDTO dto) {
		this.dto = dto;
	}
	
}
