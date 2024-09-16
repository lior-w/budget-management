package com.budgetmanagement.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/v1")
public class BudgetController {

    @GetMapping("/hi")

    public ResponseEntity<String> Hi() {

        return ResponseEntity.ok("hi");
    }
}
