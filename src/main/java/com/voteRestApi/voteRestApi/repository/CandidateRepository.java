package com.voteRestApi.voteRestApi.repository;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import org.springframework.stereotype.Repository;

import com.voteRestApi.voteRestApi.entities.Candidate;

//This class acts as an in-memory data store using ConcurrentHashMap.

@Repository
public class CandidateRepository {

	 ConcurrentMap<String,Candidate> candidates=new ConcurrentHashMap<>();
	
//Adding new candidate if they do not already exist.
	public Candidate save(String name) {
		return candidates.computeIfAbsent(name, Candidate::new);
	}
	
//Retrieve a candidate by name.
	public Candidate findByName(String name) {
		return candidates.get(name);
	}
	
//Retrieve all candidates.	
	public Iterable<Candidate> findAll(){
		return candidates.values();
		
	}
}
