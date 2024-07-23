# voting-app
Rest API for voting system using java and spring boot.
# Voting System API

This project is a simple voting system API built with Java and Spring Boot. It allows you to add candidates, cast votes, count votes, list all votes, and determine the winner.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven

### Installing

1. Clone the repository:
   
    git clone https://github.com/anuragk82/voting-app.git
   

2. Build the project using Maven:
   
    ./mvnw clean install
   

3. Run the application:
   
    ./mvnw spring-boot:run
    

The application will start and be available at `http://localhost:8090`.

## API Endpoints

### Enter Candidate

- **URL:** `/entercandidate`
- **Method:** `POST`
- **Parameters:** `name` (String)
- **Description:** Adds a new candidate with the given name and initializes their vote count to 0.

  

### Cast Vote

- **URL:** `/castvote`
- **Method:** `POST`
- **Parameters:** `name` (String)
- **Description:** Increments the vote count for the candidate with the given name.


### Count Vote

- **URL:** `/countvote`
- **Method:** `GET`
- **Parameters:** `name` (String)
- **Description:** Returns the current vote count for the candidate with the given name.


### List Votes

- **URL:** `/listvote`
- **Method:** `GET`
- **Description:** Returns a list of all candidates and their vote counts.


### Get Winner

- **URL:** `/getwinner`
- **Method:** `GET`
- **Description:** Returns the candidate with the highest number of votes.


## Running the Tests

To run the tests, execute the following command:
```sh
./mvnw test

