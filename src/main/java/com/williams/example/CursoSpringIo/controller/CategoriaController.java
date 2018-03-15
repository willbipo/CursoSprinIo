package com.williams.example.CursoSpringIo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.williams.example.CursoSpringIo.entity.Categoria;
import com.williams.example.CursoSpringIo.service.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaController {
	
	@Autowired CategoriaService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> categorias() {
		System.out.println("Mi super cambio");
		List<Categoria> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> findCategoria(@PathVariable Integer id) {
		System.out.println("Mi super cambio2");
		Categoria categoria = service.find(id);
		return ResponseEntity.ok(categoria);
	}

}
