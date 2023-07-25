package com.innovaserve.repository;

import com.innovaserve.model.entity.Cliente;
import com.innovaserve.model.entity.Servico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoRepository extends JpaRepository<Servico, Integer> {
}
