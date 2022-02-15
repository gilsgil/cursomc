package com.shadowlab.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import com.shadowlab.cursomc.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shadowlab.cursomc.domain.Categoria;

@RestController
@RequestMapping("/categorias")
public class CategoriaResource {


    @Autowired
    private CategoriaService categoriaService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable(value = "id") Integer id) {
        Categoria obj = categoriaService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
