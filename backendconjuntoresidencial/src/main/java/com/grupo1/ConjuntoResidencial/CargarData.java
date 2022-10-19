/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.grupo1.ConjuntoResidencial;

//import com.grupo1.ConjuntoResidencial.entity.Usuario;
import com.grupo1.ConjuntoResidencial.repository.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author USER
 */
@Configuration
public class CargarData {
    
    @Bean
    public CommandLineRunner iniciarBaseDatos(UsuarioRepository repository){
       
       return (args)-> {
           /*repository.save(new Usuario(91260467, "sergio", "gualdron", 1006, 6455564));
           repository.save(new Usuario(91345467, "yaneth", "peñuela", 1106, 6803456));
           repository.save(new Usuario(91876467, "ximena", "bermudez", 1206, 6865564));*/
       };
       
       
    }
    
}
