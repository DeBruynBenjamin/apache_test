package com.objis.demojpa.domaine;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Formation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id; // Identifiant formation (Cl� primaire)
	
	private String theme; // Th�me formation
	
	private int nbJour;
	
	//Constructeur
	public Formation() {
	}
	
	public int getNbJour() {
		return nbJour;
	}

	public void setNbJour(int nbJour) {
		this.nbJour = nbJour;
	}

	// Getters et Setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTheme() {
		return theme;
	}
	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	// Constructeur
	public Formation(String theme) {
		super();
		this.theme = theme;
	}	
}
