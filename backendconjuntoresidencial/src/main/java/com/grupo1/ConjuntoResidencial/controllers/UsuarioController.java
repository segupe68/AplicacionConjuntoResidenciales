/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.ConjuntoResidencial.controllers;

import com.grupo1.ConjuntoResidencial.entity.Usuario;
import com.grupo1.ConjuntoResidencial.exceptions.UsuarioNoEncontradoException;
import com.grupo1.ConjuntoResidencial.repository.UsuarioRepository;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author USER
 */
@RestController
public class UsuarioController {
    
    private final UsuarioRepository repository;

    public UsuarioController(UsuarioRepository repository) {
        this.repository = repository;
    }
    
    @GetMapping("/Usuarios")
    public List<Usuario> ListarUsuarios(){
        return repository.findAll();
    
    }
    @GetMapping("/Usuarios/{idUsuario}")
    public Usuario getUsuario(@PathVariable Long idUsuario){
        return repository.findById(idUsuario).orElseThrow(()->{
            return new UsuarioNoEncontradoException(idUsuario);
    
         });
    }
    
    @PutMapping("/Usuarios/{idUsuario}")
    public Usuario actualizarUsuario(@PathVariable Long idUsuario, @RequestBody Usuario nuevosUsuario){
        
        return repository.findById(idUsuario).map( usuario ->{
            usuario.setNombre(nuevosUsuario.getNombre());
            usuario.setApellido(nuevosUsuario.getApellido());
            usuario.setNumeroApartamento(nuevosUsuario.getNumeroApartamento());
            usuario.setNumeroTelefonico(nuevosUsuario.getNumeroTelefonico());
            return repository.save(usuario);
                    
        }).orElseGet(() ->{
            nuevosUsuario.setIdUsuario(idUsuario);
            return repository.save(nuevosUsuario);
        
        });
         
        
    }
    @PostMapping("/Usuarios")
    public Usuario crearUsuario(@RequestBody Usuario nuevoUsuario){
        return repository.save(nuevoUsuario);
        
    }
    @DeleteMapping("/Usuarios/{idUsuario}")
    public void eliminarUsuario(@PathVariable Long idUsuario){
        repository.deleteById(idUsuario);
    
    }
    
}
