package com.adea.gestionusuarios.service;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.ResponseSave;
import com.adea.gestionusuarios.model.UsuarioDTO;

import java.util.Date;
import java.util.List;

public interface IUsuarioService {
    public List<UsuarioDTO> readAll();

    public UsuarioDTO readById(Long id);

    public ResponseSave insert(Usuario usuario);

    public ResponseSave update(Usuario usuario);

    public ResponseSave delete(Long id);

    public List<UsuarioDTO> findByStatus(Character status);

    public List<UsuarioDTO> findByNombre(String nombre);

    public Usuario usuarioById(Long id);

    public Usuario usuarioUpdate(Usuario usuario);

    public Usuario usuarioInsert(Usuario usuario);

    public List<Usuario> usuarioByStatus(Character status);

    public List<Usuario> usuarioByNombre(String nombre);

    public List<Usuario> usuarioByFechaAlta(Date fecha );
}
