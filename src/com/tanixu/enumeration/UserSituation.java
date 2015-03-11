package com.tanixu.enumeration;

public class UserSituation {
	private String code;
	private String value;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public UserSituation(String code, String value) {
		this.code = code;
		this.value = value;
	}
}
