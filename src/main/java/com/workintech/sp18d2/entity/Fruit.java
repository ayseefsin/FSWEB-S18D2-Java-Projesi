package com.workintech.sp18d2.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "fruit" , schema = "workintech")
public class Fruit extends Plant{
    @Column(name = "fruit_type")
    @NotNull
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

}
