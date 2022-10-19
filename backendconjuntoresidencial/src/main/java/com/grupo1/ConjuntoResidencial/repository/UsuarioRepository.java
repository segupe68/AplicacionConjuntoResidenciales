/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.grupo1.ConjuntoResidencial.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.grupo1.ConjuntoResidencial.entity.Usuario;

/**
 *
 * @author USER
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

    
    
}
