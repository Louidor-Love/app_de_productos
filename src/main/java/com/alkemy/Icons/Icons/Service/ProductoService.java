package com.alkemy.Icons.Icons.Service;

import com.alkemy.Icons.Icons.DTO.ProductoDTO;
import org.springframework.stereotype.Service;

@Service

public class ProductoService {

    public ProductoDTO save(ProductoDTO DTO) {
        // TODO: guardar
        System.out.println("GUARDAR PRODUCTO");
        return DTO;

    }
}
