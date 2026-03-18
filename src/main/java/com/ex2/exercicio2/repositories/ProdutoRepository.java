package com.ex2.exercicio2.repositories;

import com.ex2.exercicio2.models.ProdutoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {
}
