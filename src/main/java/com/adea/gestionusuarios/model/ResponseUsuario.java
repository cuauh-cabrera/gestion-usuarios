package com.adea.gestionusuarios.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseUsuario {
    private String mensaje;
    private String codigo;
    private List<UsuarioDTO> usuarioDTOList;
}
