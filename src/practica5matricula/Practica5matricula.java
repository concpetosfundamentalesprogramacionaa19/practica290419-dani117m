/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica5matricula;
// importo el scanner
import Paquetes.descuentos;
import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Practica5matricula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner entrada 
    Scanner entrada = new Scanner(System.in);
    // definicion de variables 
    int lugar_o;
    int edad;
    int civil;
    int carga_f;
    // 
    int costo= 1330;
 
    // Escribir y leer 
    // lugar de origen 
    System.out.println("1: Zamora o 2: Loja 3: otras \n Ingrese la ciudad de origen");
    lugar_o = entrada.nextInt();
    // edad actual
    System.out.println("Ingrese su edad ");
    edad = entrada.nextInt();
    // estado civil 
    System.out.println("Ingrese su estado civil altual");
    civil = entrada.nextInt();
    // numero de hijos o carga familiar 
    System.out.println("Ingrese el numero de hijos que tiene ");
    carga_f = entrada.nextInt();
    
    
    
    //
    if (lugar_o >= 1 && lugar_o <= 2){ 
      des1 = des1  ;
    }
    if (edad >017 && edad <=20 ){
      costo= des2-costo;
    }
    if (civil ==1){
      costo= des3; 
    }
    if (carga_f >=1){
      costo= des4;  
    }
    costof = (des1+des2+des3+des4)-1330+(1330*0.02);
    System.out.printf("%s %d\n", costof);
    
  }  
    
}
