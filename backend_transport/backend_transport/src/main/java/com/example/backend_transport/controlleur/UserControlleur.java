package com.example.backend_transport.controlleur;

import org.springframework.ui.Model;
import com.example.backend_transport.model.Users;
import com.example.backend_transport.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@CrossOrigin
public class UserControlleur {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    public String register(@ModelAttribute Users users, Model model){
        System.out.println(users.toString());
      return "register";
     }
    @GetMapping("/listUsers")
    public String allListUsers(Model model){
        List<Users> listUsers = userService.listUsers();
        model.addAttribute("listUsers", listUsers);
        return "listUsers";
    }
    @GetMapping("/listUsers/{id}")
    public String oneUsers(@PathVariable Integer id , Model model){
        Optional<Users> oneUser=userService.oneUser(id);
        model.addAttribute("oneUsers",oneUser);
        return "listUsers";
    }
    @PostMapping("/registerUser")
    public String regiserUser(@ModelAttribute("users") Users users){
        System.out.println(users);
        userService.registreUser(users);
        return "home" ;
  }

}
