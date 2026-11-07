package com.usersession.serialization;

import java.io.IOException;

public class UserDriver {
	
	public static void main(String[] args) throws IOException {
		
		UserSerializable userserializabale = new UserSerializable();
		
		UserSession user = new UserSession("RG321", "Rohit", "SS444", "Pasword");
		
		userserializabale.serializeUser(user);
		
		
	}

}
