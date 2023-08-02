package com.orion.db.controllers;

import com.orion.db.models.DefaultMessageModel;
import com.orion.db.models.DefaultModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/test")
    public ResponseEntity<DefaultModel> dbTest() {
        return ResponseEntity.ok(new DefaultMessageModel("Test is correct"));
    }
}
