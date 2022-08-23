package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Venta;

public interface IVentaDAO extends JpaRepository<Venta, Long>{

}
