package com.example.api.service;

import java.util.List;

import com.example.api.dto.Venta;

public interface IVentaService {

	public List<Venta> listarVentas();
	
	public Venta guardarVenta(Venta venta);
	
	public Venta ventaXId(Long id);
	
	public void eliminarVenta(Long id);
}
