package com.adea.gestionusuarios.constants;


public final class UsuarioConstantes {
    public static final String NOT_BLANK = "Campo obligatorio";
    public static final String INVALID_EMAIL = "Por favor ingresa un email valido";
    public static final String INVALID_DATE = "La fecha debe estar en formato YYYY-MM-DD";
    public static final String NON_DECIMAL = "El valor debe ser decimal";
    public static final String NON_INTEGER = "El valor debe ser entero";
    public static final String DATE_PATTERN = "^\\d{4}-\\d{2}-\\d{2}$";
    public static final String DECIMAL_PATTERN = "^[+-]?\\d*\\.\\d+$";
    public static final String INT_PATTERN = "^[+-]?\\d+$";
    public static final String _200 = "Consulta exitosa";
    public static final String NO_CONTENT = "La consulta no arrojo ningun resultado";
    public static final String  _204 = "Sin contenido";
    public static final String NOT_FOUND = "El elemento no existe";
    public static final String _404 = "El servidor no pudo encontrar el elemento solicitado";
    public static final String SERVER_ERROR = "Error: Revisar la conexion a la base de datos y correcta implementacion de la capa Repository";
    public static final String _500 = "Error interno: Intente mas tarde";
    public static final String OK = "Operacion exitosa";
    public static final String CREATED = "Usuario creado con exito";
    public static final String UPDATED = "Usuario actualizado con exito";
    public static final String DELETED = "Usuario borrado";
    public static final Boolean FILTER = false;

    private UsuarioConstantes(){

    }
}
