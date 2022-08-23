package com.example.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api.dao.IMaquinaDAO;
import com.example.api.dto.Maquina;

@Service
public class MaquinaServiceImpl implements IMaquinaService{

	@Autowired
	IMaquinaDAO iMaquinaDAO;

	@Override
	public List<Maquina> listarMaquinas() {
		// TODO Auto-generated method stub
		return iMaquinaDAO.findAll();
	}

	@Override
	public Maquina guardarMaquina(Maquina maquina) {
		// TODO Auto-generated method stub
		return iMaquinaDAO.save(maquina);
	}

	@Override
	public Maquina maquinaXCodigo(Long codigo) {
		// TODO Auto-generated method stub
		return iMaquinaDAO.findById(codigo).get();
	}

	@Override
	public void eliminarMaquina(Long codigo) {
		// TODO Auto-generated method stub
		iMaquinaDAO.deleteById(codigo);
	}
}
