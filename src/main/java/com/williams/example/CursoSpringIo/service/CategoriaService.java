package com.williams.example.CursoSpringIo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.williams.example.CursoSpringIo.entity.Categoria;
import com.williams.example.CursoSpringIo.repository.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired 
	CategoriaRepository repository;
	
	public Categoria find(Integer id) {
		Categoria obj = repository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto no encontrado Id: " + id + ", Tipo: " + Categoria.class.getName());
		}
		return obj;
	}
	
	public List<Categoria> findAll() {
		return repository.findAll();
	}
}
