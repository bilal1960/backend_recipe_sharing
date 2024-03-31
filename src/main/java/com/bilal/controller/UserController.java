package com.bilal.controller;

import com.bilal.model.User;
import com.bilal.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;
    @PostMapping("/users")
    public User createUser(@RequestBody User user) throws Exception{

        User isExist=userRepository.findByEmail((user.getEmail()));
               if(isExist !=null){
                   throw new Exception("l'utilisateur existe déjà "+user.getEmail());
               }

        User savedUser = userRepository.save(user);

        return savedUser;

    }

    @DeleteMapping("/users/{userId}")
    public String  deleteUser(@PathVariable Long userId) throws Exception{

    userRepository.deleteById((userId));

    return  "User deleted successfully";

    }

    @GetMapping("/users")
    public List<User> getallUsers() throws Exception{

       List<User> users = userRepository.findAll();

        return  users;

    }

    public User findByEmail(String email) throws Exception{
       User user=userRepository.findByEmail((email));
        if(user==null){
            throw new Exception("utilisateur pas trouvé avec émail "+email);
        }
        return user;
    }
}
