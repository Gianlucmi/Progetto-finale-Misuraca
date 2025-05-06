package com.example.guessnumber.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.guessnumber.model.Game;
import com.example.guessnumber.service.GameService;

@Controller
public class Controllerdelgioco {

    private final GameService gameService;

    @Autowired
    public Controllerdelgioco(GameService gameService) {
        this.gameService = gameService;
    }

    @GetMapping("/")
    public String startGame(Model model) {
        Game game = gameService.initializeGame();
        model.addAttribute("game", game);
        return "index";
    }

    @PostMapping("/guess")
    public String makeGuess(@RequestParam("guess") int guess, Model model) {
        Game game = gameService.checkGuess(guess);
        model.addAttribute("game", game);
        return "index";
    }

    @GetMapping("/status")
    public String getGameStatus(Model model) {
        Game game = gameService.getCurrentGame();
        model.addAttribute("game", game);
        return "index";
    }
}