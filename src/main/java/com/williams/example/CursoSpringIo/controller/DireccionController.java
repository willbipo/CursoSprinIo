package com.williams.example.CursoSpringIo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.williams.example.CursoSpringIo.entity.Direccion;
import com.williams.example.CursoSpringIo.service.DireccionService;

@RestController
@RequestMapping(value="/direcciones")
public class DireccionController {
	
	@Autowired DireccionService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> Direccions() {
		List<Direccion> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> findDireccion(@PathVariable Integer id) {
		Direccion Direccion = service.find(id);
		return ResponseEntity.ok(Direccion);
	}

}
