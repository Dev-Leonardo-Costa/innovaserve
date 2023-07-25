package com.innovaserve;

import com.innovaserve.model.entity.Cliente;
import com.innovaserve.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
public class InnovaserveApplication {

	@Bean
	public CommandLineRunner run(@Autowired ClienteRepository repository){
		return args -> {
//			Cliente cliente = Cliente.builder().cpf("12345678912").nome("Leonardo Costa").dataCadastro(LocalDate.now()).build();
//			repository.save(cliente);
		};
	};

	public static void main(String[] args) {
		SpringApplication.run(InnovaserveApplication.class, args);
	}

}
