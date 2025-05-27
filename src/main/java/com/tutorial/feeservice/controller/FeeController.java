package com.tutorial.feeservice.controller;

import com.tutorial.feeservice.entity.FeeEntity;
import com.tutorial.feeservice.service.FeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/fee")
public class FeeController {
    @Autowired
    FeeService feeService;

    @GetMapping("/fee/{fee}")
    public ResponseEntity<FeeEntity> getFee(@PathVariable Integer fee) {
        FeeEntity feeValue = feeService.getFee(fee);
        return ResponseEntity.ok(feeValue);
    }
}
