
package p1punto15opc2;

import java.util.Scanner;


public class Ppal {
    public static void main(String[] args) {
        int seleccion ;
        Scanner lector = new Scanner(System.in);
        Cliente client = new Cliente();
        client.Loading_Data();
        client.Show_Data();
        client.consignar();
       // client.Retirar();
        client.Consultar_Saldo();
       /* do{
            System.out.println("0. Ingresar datos");
            System.out.println("1. Mostrar datos");
            System.out.println("2. Actualizar datos");
            System.out.println("3. Realizar consignación");
            System.out.println("4. Realizar retiro");
            System.out.println("5. Consultar saldo");
            System.out.println("6. Salir");
            System.out.println("Ingrese número de Figura geométrica: ");
            seleccion=lector.nextInt();
            
        }while(seleccion<6);*/
    }
    
}
