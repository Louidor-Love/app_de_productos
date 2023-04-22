package com.alkemy.Icons.Icons.Controller;

import com.alkemy.Icons.Icons.DTO.ProductoDTO;
import com.alkemy.Icons.Icons.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/productos")
public class ProductoController {
    @Autowired
    private ProductoService productoService;

    @PostMapping
    public ResponseEntity<ProductoDTO> save(@RequestBody ProductoDTO producto){
        ProductoDTO productoGuardado = productoService.save(producto);

        return ResponseEntity.status(HttpStatus.CREATED).body(productoGuardado);

    }

}
