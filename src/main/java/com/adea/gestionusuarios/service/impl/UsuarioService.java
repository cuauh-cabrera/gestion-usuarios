package com.adea.gestionusuarios.service.impl;

import com.adea.gestionusuarios.constants.UsuarioConstantes;
import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.exceptions.ResponseNoContent;
import com.adea.gestionusuarios.exceptions.ResponseNotFound;
import com.adea.gestionusuarios.exceptions.ResponseServerError;
import com.adea.gestionusuarios.model.ResponseDelete;
import com.adea.gestionusuarios.model.UsuarioDTO;
import com.adea.gestionusuarios.repository.UsuarioRepository;
import com.adea.gestionusuarios.service.IUsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class UsuarioService implements IUsuarioService {
    @Autowired
    UsuarioRepository usuarioRepository;


    // Consultar todos los usuarios
    @Override
    public List<UsuarioDTO>  readAll() {
        try {
            List<Usuario> usuarioList = usuarioRepository.findAll().stream().filter(usuario -> usuario.getIsActive()!= UsuarioConstantes.FILTER).toList();
            if (usuarioList.isEmpty()){
                log.error(UsuarioConstantes._204);
                throw new ResponseNoContent(new ResponseNoContent().getMensaje());
            }
            return usuarioList.stream().map(usuario -> {
                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setId(usuario.getId());
                usuarioDTO.setLogin(usuario.getLogin());
                usuarioDTO.setNombre(usuario.getNombre());
                usuarioDTO.setApellidoPaterno(usuario.getApellidoPaterno());
                usuarioDTO.setFechaAlta(usuario.getFechaAlta());
                usuarioDTO.setStatus(usuario.getStatus());
                log.info(UsuarioConstantes._200);
                return usuarioDTO;
            }).toList();
        }catch (ResponseServerError e){
            log.error(UsuarioConstantes.SERVER_ERROR);
            throw new ResponseServerError(new ResponseServerError().getError());
        }
    }

    // Consultar usurio por Id
    @Override
    public UsuarioDTO readById(Long id) {
        try {
            Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
            if (usuarioOptional.isPresent() && usuarioOptional.get().getIsActive()==UsuarioConstantes.FILTER){
                log.error(UsuarioConstantes.NOT_FOUND);
                throw new ResponseNotFound(new ResponseNotFound().getError());
            }

            if (usuarioOptional.isEmpty()){
                log.error(UsuarioConstantes.NOT_FOUND);
                throw new ResponseNotFound(new ResponseNotFound().getError());
            }

            if (usuarioOptional.isPresent() && usuarioOptional.get().getIsActive()!=UsuarioConstantes.FILTER){
                Usuario usuario = usuarioOptional.get();
                UsuarioDTO usuarioDTO = new UsuarioDTO();
                usuarioDTO.setId(usuario.getId());
                usuarioDTO.setLogin(usuario.getLogin());
                usuarioDTO.setNombre(usuario.getNombre());
                usuarioDTO.setApellidoPaterno(usuario.getApellidoPaterno());
                usuarioDTO.setFechaAlta(usuario.getFechaAlta());
                usuarioDTO.setStatus(usuario.getStatus());
                log.info(UsuarioConstantes._200);
                return usuarioDTO;
            }
            return new UsuarioDTO();
        }catch (ResponseServerError e){
            log.error(UsuarioConstantes.SERVER_ERROR);
            throw new ResponseServerError(new ResponseServerError().getError());
        }
    }

    // Agregar nuevo usuario
    @Override
    public Usuario insert(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
            log.info(UsuarioConstantes.OK);

        }catch (ResponseServerError e){
            log.error(UsuarioConstantes.SERVER_ERROR);
            throw new ResponseServerError(new ResponseServerError().getError());
        }
        return usuario;
    }

    // Actualizar un usuario existente
    @Override
    public Usuario update(Usuario usuario) {
        try {
            usuarioRepository.save(usuario);
            log.info(UsuarioConstantes.OK);
        }catch (ResponseServerError e){
            log.error(UsuarioConstantes.SERVER_ERROR);
            throw new ResponseServerError(new ResponseServerError().getError());
        }
        return usuario;
    }

    // Borrado logico por Id
    @Override
    public ResponseDelete delete(Long id) {
        try {
            Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);
            if (usuarioOptional.isPresent() && usuarioOptional.get().getIsActive()== UsuarioConstantes.FILTER){
                log.error(UsuarioConstantes.NOT_FOUND);
                throw new ResponseNotFound(new ResponseNotFound().getError());
            }

            if (usuarioOptional.isEmpty()){
                log.error(UsuarioConstantes.NOT_FOUND);
                throw new ResponseNotFound(new ResponseNotFound().getError());
            }

            if (usuarioOptional.isPresent() && usuarioOptional.get().getIsActive()!=UsuarioConstantes.FILTER){
               Usuario usuario = usuarioOptional.get();
               usuario.setIsActive(UsuarioConstantes.FILTER);
               usuarioRepository.save(usuario);
               ResponseDelete responseDelete = new ResponseDelete();
               responseDelete.setId(usuario.getId());
               responseDelete.setMensaje(UsuarioConstantes.DELETED);
               return responseDelete;
            }
        }catch (ResponseServerError e){
            log.error(UsuarioConstantes.SERVER_ERROR);
            throw new ResponseServerError(new ResponseServerError().getError());
        }
        return new ResponseDelete();
    }


    @Override
    public List<UsuarioDTO> findByNombre(String nombre) {
        return null;
    }

}

