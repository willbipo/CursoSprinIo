package com.williams.example.CursoSpringIo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williams.example.CursoSpringIo.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
