package com.qa.wab.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wab {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String name;

	private String colour;

	public Wab(Integer id, String name, String colour) {
		super();
		this.id = id;
		this.name = name;
		this.colour = colour;
	}

}
