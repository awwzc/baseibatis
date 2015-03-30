package com.dto;

import java.math.BigDecimal;
import java.sql.Timestamp;

public class AccountDTO {
	private  Integer  accId;
	private  String   accFirstName;
	private  String   accLastName;
	private  String   accEmail;
	private  BigDecimal accAge;
	private  String    accBannerOption;
	private  Integer   accCartOption;
	private  Timestamp accDateAdded  ;
	private  String ts;
	public String getTs() {
		return ts;
	}
	public void setTs(String ts) {
		this.ts = ts;
	}
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
	public String getAccLastName() {
		return accLastName;
	}
	public void setAccLastName(String accLastName) {
		this.accLastName = accLastName;
	}
	public String getAccEmail() {
		return accEmail;
	}
	public void setAccEmail(String accEmail) {
		this.accEmail = accEmail;
	}
	public BigDecimal getAccAge() {
		return accAge;
	}
	public void setAccAge(BigDecimal accAge) {
		this.accAge = accAge;
	}
	public String getAccBannerOption() {
		return accBannerOption;
	}
	public void setAccBannerOption(String accBannerOption) {
		this.accBannerOption = accBannerOption;
	}
	public Integer getAccCartOption() {
		return accCartOption;
	}
	public void setAccCartOption(Integer accCartOption) {
		this.accCartOption = accCartOption;
	}
	public Timestamp getAccDateAdded() {
		return accDateAdded;
	}
	public void setAccDateAdded(Timestamp accDateAdded) {
		this.accDateAdded = accDateAdded;
	}
	
	/*public String toString(){
		return "accId:"+" this.accFirstName:"+this.accFirstName+" accLastName:"+this.accLastName;
	}*/
}
