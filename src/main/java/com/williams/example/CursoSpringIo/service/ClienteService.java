package com.williams.example.CursoSpringIo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.example.CursoSpringIo.entity.Cliente;
import com.williams.example.CursoSpringIo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired 
	ClienteRepository repository;
	
	public Cliente find(Integer id) {
		Cliente obj = repository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto no encontrado Id: " + id + ", Tipo: " + Cliente.class.getName());
		}
		return obj;
	}
	
	public List<Cliente> findAll() {
		return repository.findAll();
	}
}
