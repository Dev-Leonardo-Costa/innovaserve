package com.innovaserve.model.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Builder
@Data
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false, length = 150)
    private String nome;
    @Column(nullable = false, length = 11)
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataCadastro;

    @PrePersist
    public void prePersit(){
        setDataCadastro(LocalDate.now());
    }
    public Cliente(){}

    public Cliente(Integer id, String nome, String cpf, LocalDate dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.dataCadastro = dataCadastro;
    }
}
