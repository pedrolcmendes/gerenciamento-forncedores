package com.exercicio.fornecedores.repository;

import com.exercicio.fornecedores.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long>{
}
