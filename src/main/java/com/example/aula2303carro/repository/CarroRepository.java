package com.example.aula2303carro.repository;

import java.util.HashMap;

import com.example.aula2303carro.model.Carro;

import org.springframework.stereotype.Repository;

@Repository
public class CarroRepository {

    public HashMap<Integer, Carro> repository = new HashMap<Integer, Carro>();
    
    public CarroRepository()
    {
		repository.put(1, new Carro(1, "ABCD-123", "Ford", "Cobalt", "2006"));
		repository.put(2, new Carro(2, "QWER-456", "Ford", "Fusion", "2000"));
		repository.put(3, new Carro(3, "EWKO-685", "Ford", "Focus", "2010"));
		repository.put(4, new Carro(4, "OWKD-125", "Chevrolet", "Cruze", "2018"));
		repository.put(5, new Carro(5, "ASDF-789", "Chevrolet", "Onix", "2012"));
		repository.put(6, new Carro(6, "DEKI-183", "Chevrolet", "Camaro", "2016"));
		repository.put(7, new Carro(7, "LOEP-", "Chevrolet", "Prisma", "2004"));
		repository.put(8, new Carro(8, "DELP-456", "Chevrolet", "Bolt", "2001"));
		repository.put(9, new Carro(9, "EPEP-963", "Subaru", "Outback", "2002"));
		repository.put(10, new Carro(10, "UIEP-963", "Subaru", "Forester", "2013"));
    }
    
    public Carro getCarroByID(int id){
        return repository.get(id);
    }

    public HashMap<Integer, Carro> getCarro(){
      
        return repository;
    }  
}