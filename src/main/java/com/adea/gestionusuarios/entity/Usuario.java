package com.adea.gestionusuarios.entity;

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
    @NotBlank(message = "Campo obligatorio")
    private String login;

    @Column(name = "password")
    @NotBlank(message = "Campo obligatorio")
    private String password;

    @Column(name = "nombre")
    @NotBlank(message = "Campo obligatorio")
    private String nombre;

    @Column(name = "cliente")
    @NotBlank(message = "Campo obligatorio")
    private Float cliente;

    @Column(name = "email")
    @Email(message = "Por favor ingresa una direccion de email valida")
    @NotEmpty(message = "Campo obligatorio")
    private String email;

    @Column(name = "fecha_alta")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "La fecha debe estar en formato YYYY-MM-DD")
    @NotEmpty(message = "Campo obligatorio")
    private Date fechaAlta;

    @Column(name = "fecha_baja")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "La fecha debe estar en formato YYYY-MM-DD")
    private Date fechaBaja;

    @Column(name = "status")
    @NotBlank(message = "Campo obligatorio")
    @Max(value = 1,message = "Longitud maxima 1 caracter")
    private Character status;

    @Column(name = "intentos")
    @NotBlank(message = "Campo obligatorio")
    @Pattern(regexp = "^[+-]?\\d*\\.\\d+$",message = "El valor debe ser decimal")
    private Float intentos;

    @Column(name = "fecha_revocado")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "La fecha debe estar en formato YYYY-MM-DD")
    private Date fechaRevocado;

    @Column(name = "fecha_vigencia")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "La fecha debe estar en formato YYYY-MM-DD")
    private Date fechaVigencia;

    @Column(name = "no_acceso")
    @Pattern(regexp = "^[+-]?\\d+$", message = "El valor debe ser entero")
    private Integer noAcceso;

    @Column(name = "apellido_paterno")
    private String apellidoPaterno;

    @Column(name = "apellido_materno")
    private String apellidoMaterno;

    @Column(name = "area")
    @Pattern(regexp = "^[+-]?\\d*\\.\\d+$",message = "El valor debe ser decimal" )
    private Double area;

    @Column(name = "fecha_modificacion")
    @Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$",message = "La fecha debe estar en formato YYYY-MM-DD")
    @NotBlank(message = "Campo obligatorio")
    private Date fechaModificacion;

    @Column(name = "is_active")
    private Boolean isActive;

}
