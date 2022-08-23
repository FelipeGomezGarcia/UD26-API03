package com.example.api.service;

import java.util.List;

import com.example.api.dto.Cajero;

public interface ICajeroService {

	public List<Cajero> listarCajeros();
	
	public Cajero guardarCajero(Cajero cajero);
	
	public Cajero cajeroXCodigo(Long codigo);
	
	public void eliminarCajero(Long codigo);
}
