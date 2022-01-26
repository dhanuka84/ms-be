package com.ms.model;


import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmpDTO {

	@JsonProperty("id")
    private Long id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("salary")
	private long salary;
	@JsonProperty("designation")
	private String designation;
}
