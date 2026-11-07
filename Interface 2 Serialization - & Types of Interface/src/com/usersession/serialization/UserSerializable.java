package com.usersession.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class UserSerializable { // Deciding file path
	public void serializeUser(UserSession user) throws IOException {
		
		

		FileOutputStream fos = new FileOutputStream("user.ser");

		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(user);
		oos.close();

	}

}
