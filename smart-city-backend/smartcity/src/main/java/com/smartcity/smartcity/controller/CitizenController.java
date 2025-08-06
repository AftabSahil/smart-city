package com.smartcity.smartcity.controller;

import com.smartcity.smartcity.model.Citizen;
import com.smartcity.smartcity.repository.CitizenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000") // React access
public class CitizenController {

    @Autowired
    private CitizenRepository citizenRepository;

    @GetMapping("/citizens")
    public List<Citizen> getAllCitizens() {
        List<Citizen> citizens = citizenRepository.findAll();
        System.out.println("Fetched citizens: " + citizens.size());
        return citizens;
    }

    @PostMapping("/citizens")
    public Citizen createCitizen(@RequestBody Citizen citizen) {
        return citizenRepository.save(citizen);
    }
}
