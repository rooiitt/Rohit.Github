package com.usersession.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationUserDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {

		// Connecting to the serialized file to read the byte stream
		FileInputStream fis = new FileInputStream("C:\\Eclipse Java\\Interface 2 Serialization - & Types of Interface\\user.ser"); // byte source
																														

		ObjectInputStream ois = new ObjectInputStream(fis); // Reading the byte stream and converting it back into an object
															

		UserSession usersession = (UserSession) ois.readObject(); // object and performing Down-casting from Object to UserSession
																	

		System.out.println("User ID: " + usersession.getUserId());
		System.out.println("User Name: " + usersession.getUserName());
		System.out.println("Session ID: " + usersession.getSessionId());
		System.out.println("Password: " + usersession.getPassword());

		ois.close(); // Closing the input streams
		fis.close();
	}

}
