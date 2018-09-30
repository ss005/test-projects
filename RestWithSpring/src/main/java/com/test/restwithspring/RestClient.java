package com.test.restwithspring;

import com.test.restwithspring.entity.User;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class RestClient {

    private static final String BASE_URL = "http://localhost:8080";

    public static List<User> listAllUsers() {
        RestTemplate restTemplate = new RestTemplate();
        List<User> users = restTemplate.getForObject(BASE_URL + "/users", List.class);
        return users;
    }


    public static void main(String[] args) {
        System.out.println(RestClient.listAllUsers());
    }
}
