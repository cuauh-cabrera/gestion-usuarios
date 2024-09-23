package com.adea.gestionusuarios.exceptions;

import com.adea.gestionusuarios.constants.UsuarioConstantes;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResponseNotFound extends RuntimeException{
    private String mensaje = UsuarioConstantes.NOT_FOUND;
    private String Error = UsuarioConstantes._404;

    public ResponseNotFound(){
    }

    public ResponseNotFound(String Error){
        super(Error);
    }

}
