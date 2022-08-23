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

import com.example.api.dto.Cajero;
import com.example.api.service.CajeroServiceImpl;

@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajero> listarCajeros(){
		return cajeroServiceImpl.listarCajeros();
	}
	
	@GetMapping("/cajeros/{codigo}")
	public Cajero cajeroXCodigo(@PathVariable(name="codigo")Long codigo) {
		return cajeroServiceImpl.cajeroXCodigo(codigo);
	}
	
	@PostMapping("/cajeros")
	public Cajero guardarCajero(@RequestBody Cajero cajero) {
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Cajero actualizarCajero(@PathVariable(name="codigo")Long codigo,@RequestBody Cajero cajero) {
		Cajero cajeroActualizado = cajeroServiceImpl.cajeroXCodigo(codigo);
		cajeroActualizado.setNombre(cajero.getNombre());
		cajeroActualizado.setVentas(cajero.getVentas());
		
		return cajeroServiceImpl.guardarCajero(cajeroActualizado);
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name="codigo")Long codigo) {
		cajeroServiceImpl.eliminarCajero(codigo);
	}
}
