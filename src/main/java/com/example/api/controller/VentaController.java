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

import com.example.api.dto.Venta;
import com.example.api.service.VentaServiceImpl;

@RestController
@RequestMapping("/api")
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Venta> listarVentas(){
		return ventaServiceImpl.listarVentas();
	}
	
	@GetMapping("/ventas/{id}")
	public Venta ventaXCodigo(@PathVariable(name="id")Long id) {
		return ventaServiceImpl.ventaXId(id);
	}
	
	@PostMapping("/ventas")
	public Venta guardarVenta(@RequestBody Venta venta) {
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	@PutMapping("/ventas/{id}")
	public Venta actualizarProducto(@PathVariable(name="id")Long id,@RequestBody Venta venta) {
		Venta ventaActualizado = ventaServiceImpl.ventaXId(id);
		ventaActualizado.setCajero(venta.getCajero());
		ventaActualizado.setMaquina(venta.getMaquina());
		ventaActualizado.setProducto(venta.getProducto());
		
		return ventaServiceImpl.guardarVenta(ventaActualizado);
	}
	
	@DeleteMapping("/ventas/{id}")
	public void eliminarMaquina(@PathVariable(name="id")Long id) {
		ventaServiceImpl.eliminarVenta(id);
	}
}
