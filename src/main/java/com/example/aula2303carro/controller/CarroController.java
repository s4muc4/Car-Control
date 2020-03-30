package com.example.aula2303carro.controller;

import java.util.HashMap;

import com.example.aula2303carro.CarroService;
import com.example.aula2303carro.model.Carro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/carro")
public class CarroController{

	@Autowired
	private CarroService cs;

	@GetMapping("/{id}")
	public ModelAndView getCarro(@PathVariable("id") int id){

		ModelAndView mv = new ModelAndView("carroview_byID");

		Carro carro = cs.getCarroByID(id);

		mv.addObject("carro", carro);

		System.out.println(mv.toString());

		return mv;
	}

	@GetMapping("/allcars")
	public ModelAndView getCarros(){

		ModelAndView mv = new ModelAndView("allcars");

		HashMap<Integer, Carro> carro = cs.getCarros();
		
		mv.addObject("carros", carro.values());

		System.out.println(mv.toString());
		
		return mv;
	}









}