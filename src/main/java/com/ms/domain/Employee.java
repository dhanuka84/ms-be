package com.ms.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Proxy(lazy = false)


@Entity
@Table(name = "emp99")
public class Employee {
	@Id
	private long id;
	private String name;
	private long salary;
	private String designation;

}
