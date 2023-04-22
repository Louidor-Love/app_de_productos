package com.alkemy.Icons.Icons.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTO {
    private Long id;
    private String nombre;

    private String descripcion;

    private double precio;

    private int cantidad;

}
