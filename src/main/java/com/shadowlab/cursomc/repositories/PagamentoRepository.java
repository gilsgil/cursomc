package com.shadowlab.cursomc.repositories;

import com.shadowlab.cursomc.domain.Pagamento;
import com.shadowlab.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Integer> {
}
