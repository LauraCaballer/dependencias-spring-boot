package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getUser(@PathVariable("id") int id) {
        // Respuesta de ejemplo con datos estáticos
        Map<String, Object> user = new HashMap<>();
        user.put("id", id);
        user.put("name", "Juan Sangano");
        return ResponseEntity.ok(user);
    }
}
