package com.example.springclouddemo.user.service;

import com.example.springclouddemo.user.entity.Post;
import com.example.springclouddemo.user.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Service
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    private static int userCount = 4;


    static {
        User sanjay = new User(1, "Sanjay");
        sanjay.setPosts(Arrays.asList(
                new Post(1, "Initial Post"),
                new Post(2, "second post")
        ));
        users.add(sanjay);

        User pankaj = new User(2, "Pankaj");
        pankaj.setPosts(Arrays.asList(
                new Post(1, "BirthDay Post"),
                new Post(2, "Anniversary Post")
        ));
        users.add(pankaj);

        User mayank = new User(3, "Mayank");
        mayank.setPosts(Arrays.asList(
                new Post(1, "tour post"),
                new Post(2, "marriage post")
        ));
        users.add(mayank);

        User hari = new User(4, "Hari");
        hari.setPosts(Arrays.asList(
                new Post(1, "Initial post"),
                new Post(2, "Singapore post")
        ));
        users.add(hari);

    }

    public User findById(Integer id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(new User());
    }

    public Integer createUser(User user) {
        user.setId(++userCount);
        users.add(user);
        return userCount;
    }


}
