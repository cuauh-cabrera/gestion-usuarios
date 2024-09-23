package com.adea.gestionusuarios.service;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.ResponseDelete;
import com.adea.gestionusuarios.model.UsuarioDTO;

import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDTO> readAll();

    public UsuarioDTO readById(Long id);

    public Usuario insert(Usuario usuario);

    public Usuario update(Usuario usuario);

    public ResponseDelete delete(Long id);

    public List<UsuarioDTO>  findByNombre(String nombre);
}
