package com.example.api.service;

import java.util.List;

import com.example.api.dto.Maquina;

public interface IMaquinaService {

	public List<Maquina> listarMaquinas();
	
	public Maquina guardarMaquina(Maquina maquina);
	
	public Maquina maquinaXCodigo(Long codigo);
	
	public void eliminarMaquina(Long codigo);
}
