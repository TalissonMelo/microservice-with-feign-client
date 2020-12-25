package com.talissonmelo.entities.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PositiveOrZero;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class WorkerDto {
	
	private Long id;
	
	@NotBlank(message = "Nome e obrigatório!.")
	private String name;
	
	@PositiveOrZero(message = "Valor deve ser maior que 0")
	private Double dailyIncome;
}
