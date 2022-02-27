package com.codingdojo.daikichi.ControladorDaikichi;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContoladorsDaikichi {
	@RequestMapping(value="/daikichi",method=RequestMethod.GET)
	public String paginaInicio() {
		return "Welcome!";
	}
	
	@RequestMapping(value="/daikichi/today",method=RequestMethod.GET)
	public String paginaToday() {
		return "Today you will luck in all your endeavors";
	}
	
	@RequestMapping(value="/daikichi/tomorrow",method=RequestMethod.GET)
	public String paginaTomorrow() {
		return "Tomorrow, an opportunity will arise, so be sure to be open to new ideas";
	}
}
