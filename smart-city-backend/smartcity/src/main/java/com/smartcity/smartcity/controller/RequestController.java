package com.smartcity.smartcity.controller;

import com.smartcity.smartcity.model.Request;
import com.smartcity.smartcity.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class RequestController {

    @Autowired
    private RequestRepository requestRepository;

    @GetMapping("/requests")
    public List<Request> getAllRequests() {
        List<Request> requests = requestRepository.findAll();
        System.out.println("Fetched requests: " + requests.size());
        return requestRepository.findAll();
    }

    @PostMapping("/requests")
    public Request createRequest(@RequestBody Request request) {
        return requestRepository.save(request);
    }
}
