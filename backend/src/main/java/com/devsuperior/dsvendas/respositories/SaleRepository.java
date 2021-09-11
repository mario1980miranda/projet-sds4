package com.devsuperior.dsvendas.respositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSumDTO(obj.vendeur, SUM(obj.montant)) "
			+ " FROM Sale AS obj GROUP BY obj.vendeur")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dsvendas.dto.SaleSuccessDTO(obj.vendeur, SUM(obj.visite), SUM(obj.affairs)) "
			+ " FROM Sale AS obj GROUP BY obj.vendeur")
	List<SaleSuccessDTO> successGroupedBySeller();
}