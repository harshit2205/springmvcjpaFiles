package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="trainee")
public class Trainee {

	@Id
	@Column(name="id")
	@NotNull(message="provide a valid Id")
	private Integer id;
	
	@Column(name="name")
	@NotEmpty(message="enter a name")
	private String name;
	
	@Column(name="domain")
	@NotEmpty(message="enter a domain")
	private String domain;
	
	@Column(name="location")
	@NotEmpty(message="enter a location")
	private String location;

	public Trainee() {
		super();
	}

	@Override
	public String toString() {
		return "Trainee [id=" + id + ", name=" + name + ", domain=" + domain
				+ ", location=" + location + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
