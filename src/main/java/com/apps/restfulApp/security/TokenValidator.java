package com.apps.restfulApp.security;

public interface TokenValidator {
	public boolean validateToken(String signedJwtToken);
}