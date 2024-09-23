package com.adea.gestionusuarios.repository;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    public UsuarioDTO findByNombre (@Param("nombre") String nombre);
}
