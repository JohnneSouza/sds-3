package com.devsuperior.dsvendas.core.sellers;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SellerDto implements Serializable {

    private Long id;
    private String name;

    public SellerDto(Seller seller) {
        this.id = seller.getId();
        this.name = seller.getName();
    }
}
