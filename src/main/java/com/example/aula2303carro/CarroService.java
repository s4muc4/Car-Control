package com.example.aula2303carro;

import java.util.HashMap;

import com.example.aula2303carro.model.Carro;
import com.example.aula2303carro.repository.CarroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

	@Autowired
	private CarroRepository cr;

	public Carro getCarroByID(int id){
		
		Carro carro = cr.getCarroByID(id);

		return carro;
	}

	public HashMap<Integer, Carro> getCarros(){

		HashMap<Integer, Carro> carros = cr.getCarro();

		return carros;	

	}




}