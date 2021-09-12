package com.devsuperior.dsvendas.core.sales;

import com.devsuperior.dsvendas.core.sellers.SellerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class SaleService {

    private final SaleRepository saleRepository;
    private final SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDto> findAll(Pageable pageable){
        sellerRepository.findAll();
        return saleRepository.findAll(pageable).map(SaleDto::new);
    }

}
