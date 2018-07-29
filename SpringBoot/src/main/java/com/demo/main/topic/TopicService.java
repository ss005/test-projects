package com.demo.main.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(new Topic ("springApp", "Spring Framework", "Sprign Framework Application"),
				new Topic ("java", "Spring Core", "Sprign Description") ,
				new Topic ("javascript", "JavaScript", "Javascript Description")
				));
	public List<Topic> getAllTopics () {
		return topics;
	}
	
	public Topic getTopic (String id ) {
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
	}
}
