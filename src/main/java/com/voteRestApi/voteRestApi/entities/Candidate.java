package com.voteRestApi.voteRestApi.entities;
//This class represents each candidate in the voting System.
public class Candidate {

//Name of the candidate.
	private String name;
	
//Number of votes the candidate has received,initialized to 0.
	private int countVote;
	public Candidate(String name, int countVote) {
		super();
		this.name = name;
		this.countVote = countVote;
	}
	public Candidate() {
		super();
		
	}
	@Override
	public String toString() {
		return "Candidate [name=" + name + ", countVote=" + countVote + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCountVote() {
		return countVote;
	}
	public void setCountVote(int countVote) {
		this.countVote = countVote;
	}
	
//Method to initialized vote count to 0.
	public Candidate(String name) {
		this.name=name;
		this.countVote=0;
	}

	
	
//Method to increment the vote count.
	public void voteIncrease() {
		this.countVote++;
		
  }

}
