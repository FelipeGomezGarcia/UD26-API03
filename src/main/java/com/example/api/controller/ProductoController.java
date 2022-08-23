package com.example.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.api.dto.Producto;
import com.example.api.service.ProductoServiceImpl;

@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Producto> listarProductos(){
		return productoServiceImpl.listarProductos();
	}
	
	@GetMapping("/productos/{codigo}")
	public Producto productoXCodigo(@PathVariable(name="codigo")Long codigo) {
		return productoServiceImpl.productoXCodigo(codigo);
	}
	
	@PostMapping("/productos")
	public Producto guardarProducto(@RequestBody Producto producto) {
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@PutMapping("/productos/{codigo}")
	public Producto actualizarProducto(@PathVariable(name="codigo")Long codigo,@RequestBody Producto producto) {
		Producto productoActualizado = productoServiceImpl.productoXCodigo(codigo);
		productoActualizado.setPrecio(producto.getPrecio());
		productoActualizado.setVentas(producto.getVentas());
		productoActualizado.setNombre(producto.getNombre());
		
		return productoServiceImpl.guardarProducto(productoActualizado);
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarMaquina(@PathVariable(name="codigo")Long codigo) {
		productoServiceImpl.eliminarProducto(codigo);
	}
}
