package com.innovaserve.model.entity;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
public class Servico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String descricao;

    @Column
    private BigDecimal valor;
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

}
