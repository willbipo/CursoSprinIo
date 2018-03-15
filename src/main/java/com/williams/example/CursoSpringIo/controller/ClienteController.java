package com.williams.example.CursoSpringIo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.williams.example.CursoSpringIo.entity.Cliente;
import com.williams.example.CursoSpringIo.service.ClienteService;

@RestController
@RequestMapping(value="/clientes")
public class ClienteController {
	
	@Autowired ClienteService service;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<?> Clientes() {
		List<Cliente> lista = service.findAll();
		return ResponseEntity.ok(lista);
	}
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> findCliente(@PathVariable Integer id) {
		Cliente Cliente = service.find(id);
		return ResponseEntity.ok(Cliente);
	}

}
