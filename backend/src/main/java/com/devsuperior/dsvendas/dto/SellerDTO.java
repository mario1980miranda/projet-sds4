package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SellerDTO implements Serializable {

	private static final long serialVersionUID = -528230572852238901L;
	
	private Long id;
	private String nom;
	
	public SellerDTO() {
	}

	public SellerDTO(final Long id, final String nom) {
		this.id = id;
		this.nom = nom;
	}
	
	public SellerDTO(final Seller entity) {
		this.id = entity.getId();
		this.nom = entity.getNom();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
}
