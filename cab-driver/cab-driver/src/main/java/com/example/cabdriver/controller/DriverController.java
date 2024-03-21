package com.example.cabdriver.controller;

import com.example.cabdriver.service.DriverService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {

    public int nums = 0;

    @Autowired
    public DriverService driverService;

    @PutMapping
    @RequestMapping("/update")
    public ResponseEntity updateLocation(){

        String str = "longtitude = "+Math.random()+" latitude = "+Math.random();
        driverService.sendMessage(str);
        return ResponseEntity.ok("Updated Location Successfully");
    }
}
