package com.example.webshop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "descriptions")
public class Description {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @JsonView(View.Description.class)
    private String vendor;

    @JsonView(View.Description.class)
    private String material;

    @JsonView(View.Description.class)
    private String color;

    @JsonView(View.Description.class)
    private String sex;

    @JsonView(View.Description.class)
    private String brand;

    @JsonView(View.Description.class)
    private String type;

    @JsonView(View.Description.class)
    private String season;

}
