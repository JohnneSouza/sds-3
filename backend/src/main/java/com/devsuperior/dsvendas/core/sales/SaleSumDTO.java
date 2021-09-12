package com.devsuperior.dsvendas.core.sales;

import com.devsuperior.dsvendas.core.sellers.Seller;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaleSumDTO {

    private String sellerName;
    private Double sum;

    public SaleSumDTO(Seller seller, Double sum) {
        this.sellerName = seller.getName();
        this.sum = sum;
    }
}
