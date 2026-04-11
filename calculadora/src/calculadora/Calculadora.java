/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        Scanner sc = new Scanner(System.in);
        suma calc = new suma();
         int opcion;
         System.out.println("\nMENU");
         System.out.println("1. Sumar 2 enteros");
         System.out.println("2. Sumar 3 enteros");
         System.out.println("3. Sumar 2 numeros decimales");
         System.out.println("Presiona cualquier otro numero para salir");
        
        System.out.print("Elige una opcion: ");
      
        opcion = sc.nextInt();
        if (opcion ==1)
        {
          System.out.print("Ingrese primer entero: ");
           int a = sc.nextInt();
           System.out.print("Ingrese segundo entero: ");
           int b = sc.nextInt();
            System.out.println("Resultado: " + calc.sumar(a, b));
            System.out.println();
            main(args);
        }
        else if ( opcion==2){
             System.out.print("Ingrese primer entero: ");
             int x = sc.nextInt();
             System.out.print("Ingrese segundo entero: ");
             int y = sc.nextInt();
             System.out.print("Ingrese tercer entero: ");
             int z = sc.nextInt();
             System.out.println("Resultado: " + calc.sumar(x, y, z));
            System.out.println();
            main(args);
        }
       else if (opcion == 3)
        {
            System.out.print("Ingrese primer numero decimal: ");
            double d1 = sc.nextDouble();
            System.out.print("Ingrese segundo numero decimal: ");
            double d2 = sc.nextDouble();
            System.out.println("Resultado: " + calc.sumar(d1, d2));
        }
       
        else {
            System.out.println("Programa finalizado");
        }
       
        }
}
