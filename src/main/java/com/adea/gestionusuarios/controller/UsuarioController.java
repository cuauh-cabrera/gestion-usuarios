package com.adea.gestionusuarios.controller;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.ResponseSave;
import com.adea.gestionusuarios.model.UsuarioDTO;
import com.adea.gestionusuarios.service.IUsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")

public class UsuarioController {
    @Autowired
    private IUsuarioService usuarioService;

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuario")
    public List<UsuarioDTO> readAll(){
        return usuarioService.readAll();
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping("/usuario/{id}")
    public UsuarioDTO readById(@PathVariable Long id){
        return usuarioService.readById(id);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/usuario")
    public ResponseSave insert(@RequestBody @Valid Usuario usuario){
        return usuarioService.insert(usuario);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PutMapping("/usuario/{id}")
    public ResponseSave update(@RequestBody @Valid Usuario usuario, @PathVariable Long id){
        usuario.setId(id);
        return usuarioService.update(usuario);
    }

    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping("/usuario/{id}")
    public ResponseSave delete(@PathVariable Long id){
        return usuarioService.delete(id);
    }
}
