package com.asedinfo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asedinfo.model.Persona;

public interface IPersona extends JpaRepository<Persona, Integer>{
	

}
