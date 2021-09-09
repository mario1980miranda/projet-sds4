package com.devsuperior.dsvendas.dto;

import java.io.Serializable;
import java.time.LocalDate;

import com.devsuperior.dsvendas.entities.Sale;

public class SaleDTO implements Serializable {

	private static final long serialVersionUID = -5960234782583354478L;
	
	private Long id;
	private Integer visite;
	private Integer affairs;
	private Double montant;
	private LocalDate date;
	
	private SellerDTO vendeur;
	
	public SaleDTO() {
	}

	public SaleDTO(final Long id, final Integer visite, final Integer affairs, final Double montant, final LocalDate date) {
		this.id = id;
		this.visite = visite;
		this.affairs = affairs;
		this.montant = montant;
		this.date = date;
	}
	
	public SaleDTO(final Sale entity) {
		this.id = entity.getId();
		this.visite = entity.getVisite();
		this.affairs = entity.getAffairs();
		this.montant = entity.getMontant();
		this.date = entity.getDate();
		this.vendeur = new SellerDTO(entity.getVendeur());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getVisite() {
		return visite;
	}

	public void setVisite(Integer visite) {
		this.visite = visite;
	}

	public Integer getAffairs() {
		return affairs;
	}

	public void setAffairs(Integer affairs) {
		this.affairs = affairs;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public SellerDTO getVendeur() {
		return vendeur;
	}

	public void setVendeur(SellerDTO vendeur) {
		this.vendeur = vendeur;
	}
	
}
