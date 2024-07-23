package com.voteRestApi.voteRestApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.voteRestApi.voteRestApi.entities.Candidate;
import com.voteRestApi.voteRestApi.services.CandidateService;


//This class exposes the End point of APIs.
@RestController
public class CandidateController {

    @Autowired
    private CandidateService service;

    @PostMapping("/entercandidate")
    public Candidate enterCandidate(@RequestParam String name) {
    	System.out.println("kuch v==========================================");
        return service.enterCandidate(name);
        
    }

    @PostMapping("/castvote")
    public int castVote(@RequestParam String name) {
        return service.castVote(name);
    }

    @GetMapping("/countvote")
    public int countVote(@RequestParam String name) {
        return service.countVote(name);
    }

    @GetMapping("/listvote")
    public Iterable<Candidate> listVotes() {
        return service.listVote();
    }

    @GetMapping("/getwinner")
    public Candidate getWinner() {
        return service.getWinner();
    }
}

