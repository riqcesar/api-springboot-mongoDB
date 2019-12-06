package com.henrique.crud.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.henrique.crud.api.documents.Cliente;
import com.henrique.crud.api.repository.ClienteRepository;
import com.henrique.crud.api.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> listarTodos() {
		return this.clienteRepository.findAll();
	}

	@Override
	public Optional<Cliente> listarPorId(String id) {
		return this.clienteRepository.findById(id);
	}
	

	@Override
	public Cliente cadastrar(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public Cliente atualizar(Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
 
	@Override
	public void remover(String id) {
		this.clienteRepository.deleteById(id);
	}

}
