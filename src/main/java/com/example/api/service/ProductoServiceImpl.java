package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IProductoDAO;
import com.example.api.dto.Producto;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Producto> listarProductos() {
		// TODO Auto-generated method stub
		return iProductoDAO.findAll();
	}

	@Override
	public Producto guardarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return iProductoDAO.save(producto);
	}

	@Override
	public Producto productoXCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public void eliminarProducto(Long codigo) {
		// TODO Auto-generated method stub
		iProductoDAO.deleteById(codigo);
	}
}
