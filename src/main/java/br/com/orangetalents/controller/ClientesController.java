package br.com.orangetalents.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.orangetalents.model.Cliente;
import br.com.orangetalents.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	@Autowired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public java.util.List<Cliente> listar(){
	   return clienteRepository.findAll();
	}
	
	@PostMapping
	public Cliente cadastro(@RequestBody Cliente cliente) {
	
		return clienteRepository.save(cliente);
	}
	
}
