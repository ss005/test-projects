package services;

import com.test.model.Messages;

import javax.ws.rs.GET;
import java.util.ArrayList;
import java.util.List;

public class MessageService {
    public List<Messages> getAllMessages() {
        Messages m1 = new Messages(1, "Hello World!", "Sanjay");
        Messages m2 = new Messages(2, "Hello Jersey", "Sanjay2");

        List<Messages> messagesList = new ArrayList<>();
        messagesList.add(m1);
        messagesList.add(m2);

        return messagesList;
    }
}
