package com.test.rest.messanger.resources;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.test.rest.messanger.model.Message;
import com.test.rest.service.MessageService;


@Path("/messages")

public class MessageResourse {

	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Message> getMessages() {
		
		System.out.println("All messages from Mayank are :" );
		List<Message> messages = MessageService.getAllMessages();

		//messages.parallelStream()
		
		messages.stream()
				.filter((message) -> message.getFrom().compareToIgnoreCase("Mayank") == 0)
				//.sorted((m1, m2) -> String.valueOf(m1.getId()).compareTo(String.valueOf(m2.getId())))
				.sorted((m1, m2) -> Integer.compare(m2.getId(), m1.getId()))
				.forEach(System.out::println);
		
			
		System.out.println("-------------------");
		
		messages.parallelStream()
		.filter((message) -> message.getFrom().compareToIgnoreCase("Mayank") == 0)
		//.sorted((m1, m2) -> String.valueOf(m1.getId()).compareTo(String.valueOf(m2.getId())))
		.sorted((m1, m2) -> Integer.compare(m2.getId(), m1.getId()))
		.forEachOrdered(System.out::println);
	
		

				
		return messages;
				
	}
	
}
