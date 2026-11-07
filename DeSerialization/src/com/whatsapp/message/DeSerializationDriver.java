package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializationDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis =  new FileInputStream("C:\\Eclipse Java\\Serialization - & Types of Interface\\message.ser"); //we giving the path
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Message message = (Message) ois.readObject(); // Down-Casting
		
		System.out.println("De ser: " + message.getMessage() + "User ID: " + message.getUserId() );
		
	}

}
