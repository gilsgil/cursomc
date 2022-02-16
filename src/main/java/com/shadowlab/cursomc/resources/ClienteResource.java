package com.shadowlab.cursomc.resources;

import com.shadowlab.cursomc.domain.Cliente;
import com.shadowlab.cursomc.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {


    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<?> find(@PathVariable(value = "id") Integer id) {
        Cliente obj = clienteService.buscar(id);
        return ResponseEntity.ok().body(obj);
    }

}
