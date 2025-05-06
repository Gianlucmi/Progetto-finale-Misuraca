package com.example.guessnumber.service;

import java.util.Random;

import org.springframework.stereotype.Service;

import com.example.guessnumber.model.Game;

@Service
public class GameService {

    private Game currentGame;

    public Game initializeGame() {
        currentGame = new Game();
        currentGame.setTargetNumber(new Random().nextInt(20) + 1); // Età casuale tra 1 e 20
        currentGame.setAttempts(0);
        currentGame.setStatus("Indovina l'età!"); // Stato iniziale corretto
        return currentGame;
    }

    public Game checkGuess(int guess) {
        if (currentGame == null) {
            throw new IllegalStateException("Game not initialized. Premere per iniziare un nuovo game.");
        }

        // Controlla se il gioco è già stato completato
        if (currentGame.getStatus().startsWith("Corretto!")) {
            currentGame.setStatus("Il gioco è già terminato! Premi 'START NEW GAME' per iniziare una nuova partita.");
            return currentGame;
        }

        currentGame.incrementAttempts();
        if (guess < currentGame.getTargetNumber()) {
            currentGame.setStatus("Higher! Riprova.");
        } else if (guess > currentGame.getTargetNumber()) {
            currentGame.setStatus("Lower! Riprova.");
        } else {
            currentGame.setStatus("Corretto! Hai indovinato in " + currentGame.getAttempts() + " tentativi.");
        }
        return currentGame;
    }

    public Game getCurrentGame() {
        if (currentGame == null) {
            throw new IllegalStateException("Game not initialized. Please start a new game.");
        }
        return currentGame;
    }
}