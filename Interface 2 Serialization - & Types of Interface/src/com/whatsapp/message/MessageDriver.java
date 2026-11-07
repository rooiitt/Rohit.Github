package com.whatsapp.message;

import java.io.IOException;

public class MessageDriver {
	public static void main(String[] args) throws IOException {
		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message = new Message("MSG1", "What's going on?!" , "User321");
		
		messageSerialization.serializeMsg(message);
	}

}
