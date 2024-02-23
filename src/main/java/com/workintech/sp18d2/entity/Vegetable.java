package com.workintech.sp18d2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@Entity
@Table(name = "vegetable" , schema = "workintech")
public class Vegetable extends Plant {


    @Column(name = "is_grown_on_tree")
    private boolean isGrownOnTree;
}
