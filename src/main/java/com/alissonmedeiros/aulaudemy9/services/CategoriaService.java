package com.alissonmedeiros.aulaudemy9.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alissonmedeiros.aulaudemy9.domain.Categoria;
import com.alissonmedeiros.aulaudemy9.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	public Categoria buscar(Integer id) {
		Categoria obj=repo.findOne(id);
		return obj;
		
	}
}
