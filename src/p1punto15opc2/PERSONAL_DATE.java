/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1punto15opc2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PERSONAL_DATE {
    //Variables
    String nombre, apellidos, numero_cedula, Fecha_nacimiento, dirección, telefono;
    int edad;
    //Métodos
    public void Loading_Data(){
        Scanner lector = new Scanner(System.in);
        System.out.print("ingrese nombre : ");
        nombre = lector.next();
        System.out.print("ingrese Cédula: ");
        numero_cedula = lector.next();
        System.out.print("ingrese telefono: ");
        telefono = lector.next();
        System.out.print("ingrese edad: ");
        edad = lector.nextInt();
    }
    public void Show_Data(){
        System.out.println("El nombre es: "+nombre);
        System.out.println("La cédula es: "+numero_cedula);
        System.out.println("El telefono es: "+telefono);
    }
    
    
    
}