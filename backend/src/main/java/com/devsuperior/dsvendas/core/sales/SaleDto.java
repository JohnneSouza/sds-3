package com.devsuperior.dsvendas.core.sales;

import com.devsuperior.dsvendas.core.sellers.SellerDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SaleDto {

    private Long id;
    private Integer visited;
    private Integer deals;
    private Double quantity;
    private LocalDate date;

    private SellerDto seller;

    public SaleDto(Sale sale){
        this.id = sale.getId();
        this.visited = sale.getVisited();
        this.deals = sale.getDeals();
        this.quantity = sale.getQuantity();
        this.date = sale.getDate();
        this.seller = new SellerDto(sale.getSeller());
    }
}
