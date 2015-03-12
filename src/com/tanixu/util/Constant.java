package com.tanixu.util;

public class Constant {
	public enum UserSituationEnum {
		SUCCESS("100","成功"),
		USER_NOT_FOUND("101","用户未找到"),
		NO_ACCOUNT("102","用户名不能为空"),
		NO_PASSWORD("103","密码不能为空");
		private String code;
		private String value;
		UserSituationEnum(String code, String value) {
			this.code = code;
			this.value = value;
		}
		public String getCode() {
			return code;
		}
		public String getValue() {
			return value;
		}
	}
}
