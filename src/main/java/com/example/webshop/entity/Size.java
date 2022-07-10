package com.example.webshop.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "sizes")
public class Size {

    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Product product;

    @JsonView(View.Size.class)
    private String size;

    @JsonView(View.Size.class)
    private Integer cost;


}
