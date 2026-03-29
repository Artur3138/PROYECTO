/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.grupo1_proyecto;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Grupo1_proyecto {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Variables
        String marca;
        String modelo;
        int cantpuertas;
        float motor ;
        boolean electrico;
        char tipo;
        
        //Escribir los datos
        System.out.println("ingrese la marca del auto:");
        marca= sc.nextLine();
        
        System.out.println("ingrese el modelo del auto:");
        modelo= sc.nextLine();
        
        System.out.println("ingrese la cantidad de puertas del auto:");
        cantpuertas= sc.nextInt();
        
        System.out.println("ingrese el tamaño del motor (ejm 1.0):");
        motor= sc.nextFloat();
        
        System.out.println("¿El auto es Electrico si o no ?(true o False):");
        electrico= sc.nextBoolean();
        
        System.out.println("ingrese el tipo de auto S=Sedan,C=Camioneta,D=Deportivo");
        tipo= sc.next().charAt(0);
        
        
        //Mostrar los Datos
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Cantidad de Puestas: "+cantpuertas); 
        System.out.println("Motor: "+motor);
        System.out.println("Electrico: "+electrico);
        System.out.println("Tipo: "+tipo);
           
          
    }
}
