package com.alissonmedeiros.aulaudemy9.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alissonmedeiros.aulaudemy9.domain.Categoria;
import com.alissonmedeiros.aulaudemy9.services.CategoriaService;

//importar Ctrl+Shift+O
//REST ACESSAMOS O REST
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {
	
	//ACESSAMOS O SERVIÇO
	@Autowired
	private CategoriaService service; 
	// AGORA ACESSA O CATEGORYREPOSITORY EM CATEGORIASERVICE
	// UTILIZANDO O BUSCAR
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj= service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
