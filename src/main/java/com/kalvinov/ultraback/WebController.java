package com.kalvinov.ultraback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;
import java.util.List;

@Controller
public class WebController {
    
    @Autowired
    private UserService userService;
    
    @RequestMapping("/test")
    @ResponseBody
    public String handleTest() throws IOException {
        return "ok";
    }
    
    @PostMapping("/user")
    @ResponseBody
    public String createUser(@RequestBody User user) {
        try {
            userService.saveUser(user);
            return "User created successfully";
        } catch (Exception e) {
            return "Error creating user: " + e.getMessage();
        }
    }
    
    @RequestMapping("/users")
    @ResponseBody
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }
}
