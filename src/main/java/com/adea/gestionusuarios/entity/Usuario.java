package com.adea.gestionusuarios.entity;


import com.adea.gestionusuarios.constants.UsuarioConstantes;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;


@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "login")
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private String login;

    @Column(name = "password")
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private String password;

    @Column(name = "nombre")
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private String nombre;

    @Column(name = "cliente")
    @NotNull(message = UsuarioConstantes.NOT_BLANK)
    private Float cliente;

    @Column(name = "email")
    @Email(message = UsuarioConstantes.INVALID_EMAIL)
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private String email;

    @Column(name = "fecha_alta")
    @NotNull(message = UsuarioConstantes.NOT_BLANK)
    private Date fechaAlta;

    @Column(name = "fecha_baja")
    private Date fechaBaja;

    @Column(name = "status")
    @NotNull(message = UsuarioConstantes.NOT_BLANK)
    private Character status;

    @Column(name = "intentos")
    @NotNull(message = UsuarioConstantes.NOT_BLANK)
    private Float intentos;

    @Column(name = "fecha_revocado")
    private Date fechaRevocado;

    @Column(name = "fecha_vigencia")
    private Date fechaVigencia;

    @Column(name = "no_acceso")
    private Integer noAcceso;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "area")
    private Double area;

    @Column(name = "fecha_modificacion")
    @NotNull(message = UsuarioConstantes.NOT_BLANK)
    private Date fechaModificacion;

    @Column(name = "is_active")
    private Boolean isActive;

}
