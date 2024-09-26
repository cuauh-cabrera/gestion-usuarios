package com.adea.gestionusuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDTO {
    private Long id;
    private String login;
    private String nombre;
    private String apellidoPaterno;
    private LocalDate fechaAlta;
    private Character status;
}

