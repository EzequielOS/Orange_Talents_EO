package br.com.orangetalents.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data 
@Entity(name = "Cliente")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@JsonProperty("Cliente")
	private String nome;
	
	@Column(unique = true)
	@JsonProperty("E-mail")
	private String email;
	
	@Column(unique = true)
	@JsonProperty("CPF")
	private String cpf;
	
	@Column
	@JsonProperty("Data Aniversario")
	private String nascimento;
	
}
