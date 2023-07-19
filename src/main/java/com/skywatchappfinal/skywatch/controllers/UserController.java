package com.skywatchappfinal.skywatch.controllers;

import com.skywatchappfinal.skywatch.entities.User;
import com.skywatchappfinal.skywatch.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("{id}")
    public User getUserById(@PathVariable Integer id){
        return userService.getUserById(id);
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() { return userService.getAllUsers();}

    @PostMapping("/create")
    public User createNewUser(@RequestBody User user){
        return userService.createNewUser(user);

    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable Integer id, @RequestBody User userUpdates){
        return userService.updateUser(id, userUpdates);}

    @DeleteMapping("/{id}")
    public User deleteUser(@PathVariable Integer id){
        return userService.deleteUser(id);
    }
}

