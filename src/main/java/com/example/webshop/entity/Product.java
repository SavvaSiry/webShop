package com.example.webshop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table (name = "products", schema = "public")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @JsonView(View.Product.class)
    private String name;
    @JsonView(View.Product.class)
    private String brand;

    @OneToMany(mappedBy = "product")
    @JsonView(View.Product.class)
    private List<Image> images;

    @OneToMany(mappedBy = "product")
    @JsonView(View.Product.class)
    private List<Size> sizes;

    @OneToMany(mappedBy = "product")
    @JsonView(View.Product.class)
    private List<Description> descriptions;



//1) Бренд, описание, средняя цена, и фотография продукта, наличие
//2) Описание, подробности, размеры и цены
//3) Рекомендации???

}
