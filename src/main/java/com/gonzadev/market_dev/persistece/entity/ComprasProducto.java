package com.gonzadev.market_dev.persistece.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "compras_productos")
public class ComprasProducto {

    //Se usa EmbeddedID cuando el ID es compuesto, osea son dos y esta en otra clase.
    @EmbeddedId
    private ComprasProducto id;
    private Integer cantidad;
    private Double total;
    private Boolean estado;
}
