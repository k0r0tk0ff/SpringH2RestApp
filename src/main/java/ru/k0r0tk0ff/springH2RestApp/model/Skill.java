package ru.k0r0tk0ff.springH2RestApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "skills")
public class Skill {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "skill_id")
	private long id;

	private String name;

	@ManyToOne
	@JoinColumn (name="client_id")
	@JsonBackReference
	private Client client;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
}
