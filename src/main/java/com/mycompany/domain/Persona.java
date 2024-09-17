
package com.mycompany.domain;

import lombok.Data;

/**
 * la clase persona solo se declaran las variables que se utilizaran con el@Data es como si se pusieran 
 * los get a setter 
 *
 * @author tavoa
 */
@Data
public class Persona {
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

 
    
}
