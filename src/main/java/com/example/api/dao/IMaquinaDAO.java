package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Maquina;

public interface IMaquinaDAO extends JpaRepository<Maquina, Long>{

}
