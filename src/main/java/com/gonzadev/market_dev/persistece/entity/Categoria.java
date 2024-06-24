package com.gonzadev.market_dev.persistece.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categorias")
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id_categoria")
    private Integer idCategoria;

    private String descripcion;
    private Boolean estado;

}
