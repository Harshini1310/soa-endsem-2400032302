
package com.klef.soa.docker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.klef.soa.docker.entity.PestControllerEntity;
import com.klef.soa.docker.service.PestControllerService;

@RestController
@CrossOrigin(origins="http://localhost:5173")
@RequestMapping("/PestControllerBooking")
public class PestController {

    @Autowired
    private PestControllerService pestControllerService;

    @GetMapping("/")
    public String home() {
        return "Pest Control Booking CRUD Service is running";
    }

    @PostMapping("/Add")
    public PestControllerEntity addPest(
            @RequestBody PestControllerEntity p) {
        return pestControllerService.addPest(p);
    }

    @GetMapping("/DisplayAll")
    public List<PestControllerEntity> displayAll() {
        return pestControllerService.displayAll();
    }
}
