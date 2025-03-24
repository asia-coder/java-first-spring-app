package com.todo_app.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @GetMapping
    public List<String> sayHello() {
        return List.of("Hello", "World !!!", "How are you ?", "I am fine.");
    }

}
