package br.org.com.prl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.prl.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {

}
