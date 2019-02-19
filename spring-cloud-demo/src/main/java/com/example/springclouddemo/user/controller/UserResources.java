package com.example.springclouddemo.user.controller;

import com.example.springclouddemo.user.entity.User;
import com.example.springclouddemo.user.service.UserDaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/")
public class UserResources {
    @Value("${project.version}")
    String version;

    @Autowired
    private UserDaoService userDaoService;

    @GetMapping("/users/{id}")
    public User findUserById(@PathVariable Integer id) {
        return userDaoService.findById(id);
    }

    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        return "user created with id " + userDaoService.createUser(user);
    }

    @GetMapping("/version")
    public String getVersion() {
        return version;
    }


}
