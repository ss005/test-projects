package com.test;

import com.test.model.Messages;
import services.MessageService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("messages")
public class MessageResource {
    @GET
    @Produces(MediaType.APPLICATION_XML)

    public List<Messages> showMessages() {
        MessageService messageService = new MessageService();
        return messageService.getAllMessages();
    }

}
