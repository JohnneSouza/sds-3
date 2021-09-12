package com.devsuperior.dsvendas.rest;

import com.devsuperior.dsvendas.core.sales.SaleDto;
import com.devsuperior.dsvendas.core.sales.SaleService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sales")
@RequiredArgsConstructor
public class SaleController {

    private final SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDto>> findAll(Pageable pageable){
        return ResponseEntity.ok(service.findAll(pageable));
    }

}
