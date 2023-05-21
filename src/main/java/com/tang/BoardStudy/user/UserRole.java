package com.tang.BoardStudy.user;

import lombok.Getter;

@Getter
public enum UserRole {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    PARTNER("ROLE_PARTNER");
	 private final String value;

	    UserRole(String value) {
	        this.value = value;
	    }

	    public String getValue() {
	        return value;
	    }
}