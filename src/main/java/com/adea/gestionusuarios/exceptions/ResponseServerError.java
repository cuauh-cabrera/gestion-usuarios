package com.adea.gestionusuarios.exceptions;

import com.adea.gestionusuarios.constants.UsuarioConstantes;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class ResponseServerError extends RuntimeException{
    private String mensaje = UsuarioConstantes.SERVER_ERROR;
    private String Error = UsuarioConstantes._500;

    public ResponseServerError(){

    }

    public ResponseServerError(String Error){
        super(Error);
    }
}
