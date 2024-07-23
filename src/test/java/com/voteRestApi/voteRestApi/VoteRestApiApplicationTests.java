package com.voteRestApi.voteRestApi;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.voteRestApi.voteRestApi.services.CandidateService;

@SpringBootTest
class VoteRestApiApplicationTests {
	

	    @Autowired
	    private CandidateService service;

	    @Test
	    void testEnterCandidate() {
	        assertNotNull(service.enterCandidate("ajay"));
	        assertNotNull(service.enterCandidate("vijay"));
	       
	    }

	    @Test
	    void testCastVote() {
	        service.enterCandidate("ajay");
	    
	        assertEquals(1, service.castVote("ajay"));
	        assertEquals(2, service.castVote("ajay"));
	     
	    }

	    @Test
	    void testCountVote() {
	        service.enterCandidate("vijay");
	        service.castVote("vijay");
	        assertEquals(1, service.countVote("vijay"));
	    }

	    @Test
	    void testListVotes() {
	        assertNotNull(service.listVote());
	    }

	    @Test
	    void testGetWinner() {
	        service.enterCandidate("ajay");
	        service.castVote("ajay");
	        assertEquals("ajay", ((CandidateService) service).getWinner().getName());
	    }
	}



