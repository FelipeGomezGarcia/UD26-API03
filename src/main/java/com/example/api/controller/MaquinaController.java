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

import com.example.api.dto.Maquina;
import com.example.api.service.MaquinaServiceImpl;

@RestController
@RequestMapping("/api")
public class MaquinaController {

	@Autowired
	MaquinaServiceImpl maquinaServiceImpl;
	
	@GetMapping("/maquinas")
	public List<Maquina> listarMaquinas(){
		return maquinaServiceImpl.listarMaquinas();
	}
	
	@GetMapping("/maquinas/{codigo}")
	public Maquina maquinaXCodigo(@PathVariable(name="codigo")Long codigo) {
		return maquinaServiceImpl.maquinaXCodigo(codigo);
	}
	
	@PostMapping("/maquinas")
	public Maquina guardarMaquina(@RequestBody Maquina maquina) {
		return maquinaServiceImpl.guardarMaquina(maquina);
	}
	
	@PutMapping("/maquinas/{codigo}")
	public Maquina actualizarMaquina(@PathVariable(name="codigo")Long codigo,@RequestBody Maquina maquina) {
		Maquina maquinaActualizado = maquinaServiceImpl.maquinaXCodigo(codigo);
		maquinaActualizado.setPiso(maquina.getPiso());
		maquinaActualizado.setVentas(maquina.getVentas());
		
		return maquinaServiceImpl.guardarMaquina(maquinaActualizado);
	}
	
	@DeleteMapping("/maquinas/{codigo}")
	public void eliminarMaquina(@PathVariable(name="codigo")Long codigo) {
		maquinaServiceImpl.eliminarMaquina(codigo);
	}
}
