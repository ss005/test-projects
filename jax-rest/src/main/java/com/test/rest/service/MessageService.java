package com.test.rest.service;

import java.util.Arrays;
import java.util.List;

import com.test.rest.messanger.model.Message;

public class MessageService {
	public static List<Message> getAllMessages() {
		Message message = new Message(1, "Mayank", "Hari", "Aur bhai kya chal rha ");
		Message message2 = new Message(2, "Hari", "Mayank", "Sab badhiya chal rha bhai ");
		Message message3 = new Message(3, "Sanjay", "Mayank/Hari", "Kya chutiyapa macha rakhe ho be tumlog");
		Message message4 = new Message(4, "Mayank", "Sanjay", "Saale chutiyapa to tumne machaya hua hai ");

		return Arrays.asList(message, message2, message3, message4);
	}

}
