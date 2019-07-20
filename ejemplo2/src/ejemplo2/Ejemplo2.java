/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import java.util.Scanner;

/**
 *
 * @author Tiffany
 */
public class Ejemplo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre="", direccion="",telefono="";
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresar Nombre");
        nombre = leer.nextLine();
        
        System.out.println("Ingresar Direccion");
        direccion = leer.nextLine();
        
        System.out.println("Ingresar Telefono");
        telefono = leer.nextLine();
        // comentario equisde
        System.out.println("Su nombre es: "+nombre+"\nSu direccion es: "+direccion+"\nSu Telefono es: "+telefono);
    }
    
}
