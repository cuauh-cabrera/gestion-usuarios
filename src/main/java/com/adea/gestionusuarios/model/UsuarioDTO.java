package com.adea.gestionusuarios.model;

import com.adea.gestionusuarios.entity.Usuario;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String login;
    private String nombre;
    private String apellidoPaterno;
    private Date fechaAlta;
    private Character status;
}

