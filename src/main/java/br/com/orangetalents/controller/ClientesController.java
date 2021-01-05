package br.com.orangetalents.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.orangetalents.repository.ClienteRepository;

@RestController
@RequestMapping("/clientes")
public class ClientesController {
	@AutoWired
	private ClienteRepository clienteRepository;
	
	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
}
