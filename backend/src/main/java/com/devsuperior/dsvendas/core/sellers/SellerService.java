package com.devsuperior.dsvendas.core.sellers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SellerService {

    private final SellerRepository repository;

    public List<SellerDto> findAll(){
        return repository.findAll().stream().map(SellerDto::new).collect(Collectors.toList());
    }
}
