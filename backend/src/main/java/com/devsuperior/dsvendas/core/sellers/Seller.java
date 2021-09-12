package com.devsuperior.dsvendas.core.sellers;

import com.devsuperior.dsvendas.core.sales.Sale;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tb_sellers")
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "seller")
    private List<Sale> sales;

}
