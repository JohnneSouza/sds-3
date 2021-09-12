package com.devsuperior.dsvendas.core.sales;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.devsuperior.dsvendas.core.sales.SaleSumDTO(obj.seller, SUM(obj.quantity)) " +
            "FROM Sale as obj GROUP BY obj.seller")
    List<SaleSumDTO> quantityGroupedBySeller();

    @Query("SELECT new com.devsuperior.dsvendas.core.sales.SaleSuccessDTO(obj.seller, SUM(obj.visited), sum (obj.deals)) " +
            "FROM Sale as obj GROUP BY obj.seller")
    List<SaleSuccessDTO> successGroupedBySeller();
}
