package br.org.com.prl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.com.prl.model.Promocao;

public interface PromocaoRespository extends JpaRepository<Promocao,Long> {

}
