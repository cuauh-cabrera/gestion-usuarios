package com.adea.gestionusuarios.view;

import com.adea.gestionusuarios.entity.Usuario;
import com.adea.gestionusuarios.model.ResponseSave;
import com.adea.gestionusuarios.model.UsuarioDTO;
import com.adea.gestionusuarios.service.impl.UsuarioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ViewController {

    // Muestra logs del controller en consola
    private static  final Logger logger = LoggerFactory.getLogger(ViewController.class);

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/")
    public String home(ModelMap model){
        List<UsuarioDTO> usuarios = usuarioService.readAll();
        usuarios.forEach((usuario)->logger.info(usuario.toString()));
        model.put("usuarios",usuarios);
        return "index";
    }

    @GetMapping("/agregar")
    public String viewAgregar(){
        return "agregar";
    }

    @PostMapping("/agregar")
    public String addUsuario(@ModelAttribute("usuarioForm") Usuario usuario){
        logger.info("Usuario agregado: " + usuario);
        usuarioService.usuarioInsert(usuario);
        return "redirect:/";
    }

    @GetMapping("/editar/{id}")
    public String viewActualizar(@PathVariable(value = "id") Long id, ModelMap model){
         Usuario usuario = usuarioService.usuarioById(id);
         logger.info("Editar usuario: " + usuario);
         model.put("usuario",usuario);
         return "editar";
    }

    @PostMapping("/editar")
    public String editUsuario(@ModelAttribute("usuario") Usuario usuario){
        logger.info("Usuario editado: " + usuario);
        usuarioService.usuarioUpdate(usuario);
        return "redirect:/";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminarUsuario(@PathVariable(value = "id") Long id, ModelMap model){
        ResponseSave usuario = usuarioService.delete(id);
        logger.info("Usuario eliminado :" + usuario);
        model.put("usuario", usuario);
        return "redirect:/";
    }





}
