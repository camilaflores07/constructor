/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor1;

/**
 *
 * @author 50494
 */
public class personas {
    String nombre;
    int edad;
    
    //metodo constructor
    public personas(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad; 
    }
    public void mostrar() {
        System.out.println("el nombre es "+nombre);
        System.out.println("el edad es "+edad);
        
        
        
    }
}
