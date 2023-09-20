/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen2;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Examen2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
    
      System.out.println("Ingresa el nombre de un instrumento");
      String I1 = scanner.nextLine();
    
      System.out.println("Ingresa el precio de compra del instrumento");
     double P1 = scanner.nextDouble();
    
     scanner.nextLine();
     
     System.out.println("Ingresa el nombre del segundo instrumento");
     String I2 = scanner.nextLine();
     
     System.out.println("Ingresa el precio del segundo instrumento");
     double P2 = scanner.nextDouble();
     
     scanner.nextLine();
     
     System.out.println("Ingresa el nombre del tercer instrumento");
     String I3 = scanner.nextLine();
     
     System.out.println("Ingresa el precio del tercer instrumento");
     double P3 = scanner.nextDouble();
     
     
     double producto1D = (1250.45-P1);
     double producto2D = (3743-P2);
     double producto3D = (2683.78);
     scanner.close();
     
     double producto1DP = (producto1D/P1)*100 ;
     double producto2DP = (producto2D/P2)*100 ;
     double producto3DP = (producto3D/P3)*100 ;
     
     System.out.println(" El porcentaje de ganancia de "+1D+" es de "+ producto1DP + " % ");
     System.out.println(" El porcentaje de ganancia de "+2D+" es de "+ producto2DP + " % ");
     System.out.println(" El porcentaje de ganancia de "+3D+" es de "+ producto3DP + " % "); 
     
     
     
     
     
     
             
     
     
     
     
     
     
     
     
    
    
    
    }
}
