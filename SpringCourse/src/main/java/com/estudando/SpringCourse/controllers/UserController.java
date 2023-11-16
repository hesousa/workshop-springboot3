package com.estudando.SpringCourse.controllers;

import com.estudando.SpringCourse.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Maria", "mariateste@teste.com", "3499999999", "12345");
        return ResponseEntity.ok().body(u);
    }
}
