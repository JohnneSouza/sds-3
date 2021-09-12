package com.devsuperior.dsvendas.rest;

import com.devsuperior.dsvendas.core.sales.SaleDTO;
import com.devsuperior.dsvendas.core.sales.SaleService;
import com.devsuperior.dsvendas.core.sales.SaleSuccessDTO;
import com.devsuperior.dsvendas.core.sales.SaleSumDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sales")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

    @GetMapping("quantity-by-seller")
    public ResponseEntity<List<SaleSumDTO>> quantityGroupedBySeller(){
        return ResponseEntity.ok(service.quantityGroupedBySeller());
    }

    @GetMapping("success-by-seller")
    public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
        return ResponseEntity.ok(service.successGroupedBySeller());
    }

}
