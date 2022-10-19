/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.ConjuntoResidencial.exceptions;

/**
 *
 * @author USER
 */
public class UsuarioNoEncontradoException extends RuntimeException{

    public UsuarioNoEncontradoException(Long idUsuario) {
        super("No se pudo encontrar usuario con id: "+ idUsuario);
    }
    
    
    
}
