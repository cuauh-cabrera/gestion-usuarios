package com.adea.gestionusuarios.entity;


import com.adea.gestionusuarios.constantes.UsuarioConstantes;
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
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private Float cliente;

    @Column(name = "email")
    @Email(message = UsuarioConstantes.INVALID_EMAIL)
    @NotEmpty(message = UsuarioConstantes.NOT_BLANK)
    private String email;

    @Column(name = "fecha_alta")
    @Pattern(regexp = UsuarioConstantes.DATE_PATTERN,message = UsuarioConstantes.INVALID_DATE)
    @NotEmpty(message = UsuarioConstantes.NOT_BLANK)
    private Date fechaAlta;

    @Column(name = "fecha_baja")
    @Pattern(regexp = UsuarioConstantes.DATE_PATTERN,message = UsuarioConstantes.INVALID_DATE)
    private Date fechaBaja;

    @Column(name = "status")
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private Character status;

    @Column(name = "intentos")
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    @Pattern(regexp = UsuarioConstantes.DECIMAL_PATTERN,message = UsuarioConstantes.NON_DECIMAL)
    private Float intentos;

    @Column(name = "fecha_revocado")
    @Pattern(regexp = UsuarioConstantes.DATE_PATTERN,message = UsuarioConstantes.INVALID_DATE)
    private Date fechaRevocado;

    @Column(name = "fecha_vigencia")
    @Pattern(regexp = UsuarioConstantes.DATE_PATTERN,message = UsuarioConstantes.INVALID_DATE)
    private Date fechaVigencia;

    @Column(name = "no_acceso")
    @Pattern(regexp = UsuarioConstantes.INT_PATTERN, message = UsuarioConstantes.NON_INTEGER)
    private Integer noAcceso;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "area")
    @Pattern(regexp = UsuarioConstantes.DECIMAL_PATTERN,message = UsuarioConstantes.NON_DECIMAL )
    private Double area;

    @Column(name = "fecha_modificacion")
    @Pattern(regexp = UsuarioConstantes.DATE_PATTERN,message = UsuarioConstantes.INVALID_DATE)
    @NotBlank(message = UsuarioConstantes.NOT_BLANK)
    private Date fechaModificacion;

    @Column(name = "is_active")
    private Boolean isActive;

}
