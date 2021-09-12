package com.devsuperior.dsvendas.rest;

import com.devsuperior.dsvendas.core.sellers.SellerDto;
import com.devsuperior.dsvendas.core.sellers.SellerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("sellers")
@RequiredArgsConstructor
public class SellerController {

    private final SellerService service;

    @GetMapping
    public ResponseEntity<List<SellerDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

}
