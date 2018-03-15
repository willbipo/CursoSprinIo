package com.williams.example.CursoSpringIo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.example.CursoSpringIo.entity.Direccion;
import com.williams.example.CursoSpringIo.repository.DireccionRepository;

@Service
public class DireccionService {
	
	@Autowired 
	DireccionRepository repository;
	
	public Direccion find(Integer id) {
		Direccion obj = repository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto no encontrado Id: " + id + ", Tipo: " + Direccion.class.getName());
		}
		return obj;
	}
	
	public List<Direccion> findAll() {
		return repository.findAll();
	}
}
