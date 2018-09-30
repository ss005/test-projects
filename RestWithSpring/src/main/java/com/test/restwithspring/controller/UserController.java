package com.test.restwithspring.controller;

import com.test.restwithspring.entity.User;
import com.test.restwithspring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Component
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = {"", "/", "/home"})
    public String showHomePage() {
        return "Welcome to Rest with Spring Zone... :) ";
    }

    //Create
    @PostMapping(value = "/user")
    public ResponseEntity<?> save(@RequestBody User user) {
        System.out.println(user);
        int id = userService.saveUser(user);
        return ResponseEntity.ok(("User has successfully been created with id " + id));
    }

    //read
    //@RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping (value = "/users")
    public ResponseEntity<List<User>> listAllUsers() {
        System.out.println("inside listAllUsers......");
        List<User> userList = userService.findAllUsers();
        return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }

    //readById
    @GetMapping(value = "/user/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") int id ) {
        User user = userService.findById(id);
        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    //Update
    @PostMapping(value = "/user/update")
    public ResponseEntity<?> updateUser(@RequestBody User user ) {
        userService.updateUser(user);
        return ResponseEntity.ok("updated successfully");
    }

    //deleteById
    @DeleteMapping(value = "/user/{id}")
    public ResponseEntity<?> deleteUserById(@PathVariable(value = "id") int id) {
        userService.deleteUserById(id);
        return ResponseEntity.ok("User successfully deleted with id " + id);
    }


}
