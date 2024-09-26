package com.adea.gestionusuarios.repository;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.UsuarioDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    List<Usuario> findByStatusAndIsActiveTrue(Character status);

    List<Usuario> findByNombreAndIsActiveTrue(String nombre);

    List<Usuario> findByFechaAltaAndIsActiveTrue(Date fecha);
}
