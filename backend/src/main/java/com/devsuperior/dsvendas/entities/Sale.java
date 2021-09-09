package com.devsuperior.dsvendas.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "visited")
	private Integer visite;
	@Column(name = "deals")
	private Integer affairs;
	@Column(name = "amount")
	private Double montant;
	private LocalDate date;
	
	@ManyToOne
	@JoinColumn(name = "seller_id")
	private Seller vendeur;
	
	public Sale() {
	}

	public Sale(final Long id, final Integer visite, final Integer affairs, final Double montant, final LocalDate date, final Seller vendeur) {
		this.id = id;
		this.visite = visite;
		this.affairs = affairs;
		this.montant = montant;
		this.date = date;
		this.vendeur = vendeur;
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

	public Seller getVendeur() {
		return vendeur;
	}

	public void setVendeur(Seller vendeur) {
		this.vendeur = vendeur;
	}
}
