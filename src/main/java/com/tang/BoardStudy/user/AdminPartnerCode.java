package com.tang.BoardStudy.user;

public enum AdminPartnerCode {
	Admin(1),
	PARTNER(0);
	
	private int value;
	
	AdminPartnerCode(int value){
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	
}
