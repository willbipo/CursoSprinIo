package com.williams.example.CursoSpringIo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.williams.example.CursoSpringIo.entity.Ciudad;

public interface CiudadRepository extends JpaRepository<Ciudad, Integer>{

}
