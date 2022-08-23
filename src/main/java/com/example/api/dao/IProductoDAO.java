package com.example.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.api.dto.Producto;

public interface IProductoDAO extends JpaRepository<Producto, Long>{

}
