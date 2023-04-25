package br.com.cadastro.repository;

import br.com.cadastro.model.Estado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface EstadoRepository extends JpaRepository<Estado, Long> {



}
