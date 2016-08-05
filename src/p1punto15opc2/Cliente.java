
package p1punto15opc2;

import java.util.Scanner;


public class Cliente extends PERSONAL_DATE{
    //Variables
    private double saldo = 123;
    private Scanner lector;
    //Métodos
    public void Actualizar_datos(){
        lector= new Scanner(System.in);
        System.out.print("ingrese nuevo nombre : ");
        nombre = lector.next();
        System.out.print("ingrese nueva Cédula: ");
        numero_cedula = lector.next();
        System.out.print("ingrese nuevo telefono: ");
        telefono = lector.next();
    }
    public void consignar(){
        System.out.println("Digite valor a consignar: ");
        saldo = + lector.nextDouble();
        
    }
    public void Consultar_Saldo(){
        System.out.println("Su saldo es: "+saldo);
    }
    /*public void Retirar(){
        System.out.print("Digite valor a retirar: ");
        saldo = saldo-lector.nextDouble();
    }*/
}
