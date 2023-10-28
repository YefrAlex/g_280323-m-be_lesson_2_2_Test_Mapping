package de.telran.g_280323mbe_lesson_2_2.controller;

import de.telran.g_280323mbe_lesson_2_2.domen.entity.User;
import de.telran.g_280323mbe_lesson_2_2.service.CommonUserService;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    public CommonUserService commonUserService = new CommonUserService();

    //GET -> http://localhost:8080/users/all
    @GetMapping("/all")
    public List<User> getAll() {
        return commonUserService.getAll();
    }
    //GET -> http://localhost:8080/users/name

    @GetMapping("/{name}")
    public User getUser (@PathVariable String name){
        return commonUserService.getByName(name);
    }

    // POST -> http://localhost:8080/users/add
    @PostMapping("/add")
    public  User addUser (@RequestBody User user){
        commonUserService.add(user);
        return user;
    }
}
