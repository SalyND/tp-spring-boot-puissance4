package com.igs.ipi.tpspringbootsalyndiaye.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.igs.ipi.tpspringbootsalyndiaye.modele.GameModele;
import com.igs.ipi.tpspringbootsalyndiaye.service.GameService;

import Session.PartieEnCours;

@Controller
@RequestMapping("/game")
public class GameController {
	
	
	@Autowired
	private GameService gameService;
	
	@Autowired
	private PartieEnCours partieEnCours;
	
	public GameController(GameService gameService) {
		
	}
	
	public GameController(GameService gameService, PartieEnCours partieEnCours) {
		this.gameService = gameService;
		this.partieEnCours = partieEnCours;
	}
	
	@GetMapping("/new")
	public ModelAndView SetnewGame () {
    GameModele gameModele = gameService.newGame();
    partieEnCours.setGameModele(gameModele);
    ModelAndView mav = new ModelAndView("game");
    mav.addObject("gameModele", gameModele); 
    return mav; 
		                
		    }
	
	@GetMapping("/new")
	public ModelAndView GetnewGame () {
    GameModele gameModele = gameService.newGame();
    partieEnCours.getGameModele(gameModele);
    ModelAndView mav = new ModelAndView("game");
    mav.addObject("gameModele", gameModele); 
    return mav; 
		                
		    }
	
}
