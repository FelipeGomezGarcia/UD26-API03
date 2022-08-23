package com.example.api.service;

import java.util.List;

import com.example.api.dto.Producto;

public interface IProductoService {

	public List<Producto> listarProductos();
	
	public Producto guardarProducto(Producto producto);
	
	public Producto productoXCodigo(Long codigo);
	
	public void eliminarProducto(Long codigo);
}
