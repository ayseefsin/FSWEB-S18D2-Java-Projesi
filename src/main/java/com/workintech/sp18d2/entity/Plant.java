package com.workintech.sp18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@MappedSuperclass
public class Plant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    @NotNull
    @Size(min = 2,max = 45,message = "name size must be between 2 and 45 ")
    private String name;

    @Column(name = "price")
    @DecimalMin("10")
    private double price;
}
