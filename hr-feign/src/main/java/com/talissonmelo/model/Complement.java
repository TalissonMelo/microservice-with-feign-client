package com.talissonmelo.model;

import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Complement {

	@NotEmpty(message = "Campo número e Obrigatório!.")
	private String numero;
	private String complemento;
}
