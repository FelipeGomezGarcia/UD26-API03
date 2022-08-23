package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.ICajeroDAO;
import com.example.api.dto.Cajero;

@Service
public class CajeroServiceImpl implements ICajeroService{
	
	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajero> listarCajeros() {
		// TODO Auto-generated method stub
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajero guardarCajero(Cajero cajero) {
		// TODO Auto-generated method stub
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajero cajeroXCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public void eliminarCajero(Long codigo) {
		// TODO Auto-generated method stub
		iCajeroDAO.deleteById(codigo);
	}
}
