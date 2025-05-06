# Guess the Number Game

## Overview
This is a simple "Guess the Number" game built using Spring Boot. The application allows users to play a guessing game where they try to guess a randomly generated number within a certain range. 

## Features
- Start a new game
- Make guesses and receive feedback
- View game status and number of attempts
- Reset the game

## Project Structure
```
guess-number-game
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── guessnumber
│   │   │               ├── GuessNumberApplication.java
│   │   │               ├── controller
│   │   │               │   └── GameController.java
│   │   │               ├── service
│   │   │               │   └── GameService.java
│   │   │               └── model
│   │   │                   └── Game.java
│   │   └── resources
│   │       ├── application.properties
│   │       └── templates
│   │           └── index.html
├── pom.xml
└── README.md
```

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven

### Running the Application
1. Clone the repository:
   ```
   git clone <repository-url>
   ```
2. Navigate to the project directory:
   ```
   cd guess-number-game
   ```
3. Build the project using Maven:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```
5. Open your web browser and go to `http://localhost:8080` to start playing the game.

## How to Play
1. Click on "Start Game" to begin.
2. Enter your guess in the input field and submit.
3. The application will provide feedback on whether your guess is too high, too low, or correct.
4. Keep guessing until you find the correct number.
5. You can reset the game at any time to start over.

## License
This project is licensed under the MIT License - see the LICENSE file for details.