package com.talissonmelo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class Address {
		 private String cep;
		 private String logradouro;
		 private String complemento;
		 private String bairro;
		 private String localidade;
		 private String uf;
		 private String ibge;
		 private String gia;
		 private String ddd;
		 private String siafi;
		 private String numero;
}
