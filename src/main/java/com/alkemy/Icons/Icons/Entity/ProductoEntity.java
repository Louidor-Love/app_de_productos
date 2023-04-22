package com.alkemy.Icons.Icons.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@Getter
@Setter
public class ProductoEntity {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private Long id;

    private String nombre;

    private String descripcion;

    private Double precio;

    private Integer cantidad;
}
