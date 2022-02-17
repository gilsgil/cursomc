package com.shadowlab.cursomc.repositories;

import com.shadowlab.cursomc.domain.ItemPedido;
import com.shadowlab.cursomc.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemPedidoRepository extends JpaRepository<ItemPedido, Integer> {
}
