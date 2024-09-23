package com.adea.gestionusuarios.exceptions;


import com.adea.gestionusuarios.constants.UsuarioConstantes;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Getter
@Setter
@ResponseStatus(HttpStatus.NO_CONTENT)
public class ResponseNoContent extends RuntimeException {
    private String mensaje = UsuarioConstantes.NO_CONTENT;
    private String Error = UsuarioConstantes._204;

    public ResponseNoContent(){

    }

    public ResponseNoContent(String Error){
        super(Error);
    }

}
