package com.whatsapp.message;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class MessageSerialization {

	public void serializeMsg(Message message) throws IOException {
		
		FileOutputStream fio = new FileOutputStream("message.ser");
		
		ObjectOutputStream oos = new ObjectOutputStream(fio);
		
		oos.writeObject(message); //writing
		
		oos.close(); // close the connection
	}

}
