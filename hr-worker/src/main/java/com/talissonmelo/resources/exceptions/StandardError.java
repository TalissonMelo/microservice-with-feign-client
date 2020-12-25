package com.talissonmelo.resources.exceptions;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(value = Include.NON_NULL)
public class StandardError {

	private Integer status;
	private OffsetDateTime timestamp;
	private String msg;
	private List<FieldName> errors = new ArrayList<FieldName>();

}