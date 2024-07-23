package com.voteRestApi.voteRestApi.services;

import java.util.ArrayList;
import java.util.Comparator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.voteRestApi.voteRestApi.entities.Candidate;
import com.voteRestApi.voteRestApi.repository.CandidateRepository;

//This class handles the business logic.

@Service
public class CandidateService {
@Autowired
	private CandidateRepository repo;

//Method to Add a new candidate.
	public Candidate enterCandidate(String name) {
		return repo.save(name);
	}
	
	
//Method to increment the vote count for an existing candidate.	
	public int castVote(String name) {
		Candidate candidate=repo.findByName(name);
		if(candidate!=null) {
			candidate.voteIncrease();
			return candidate.getCountVote();
		}else{
			throw new IllegalArgumentException("No Candidate Found");	
	    }
	}
	

//Method to retrieve the vote count for a candidate.
	 public int countVote(String name) {
	        Candidate candidate = repo.findByName(name);
	        if (candidate != null) {
	            return candidate.getCountVote();
	        } else {
	            throw new IllegalArgumentException("Candidate not found");
	        }
	    }
	
	
//Method to list all candidate and there vote count
	public Iterable<Candidate> listVote(){
		return repo.findAll();
	}


//Method to find the candidate with the highest vote count.
	 public Candidate getWinner() {
	        Candidate winner = null;
	        for (Candidate candidate : repo.findAll()) {
	            if (winner == null || candidate.getCountVote() > winner.getCountVote()) {
	                winner = candidate;
	            }
	        }
	        return winner;
	    }

	
	
	
}
