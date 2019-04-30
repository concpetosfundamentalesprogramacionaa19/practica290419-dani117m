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
    double costo;
    double costof;
 
    // Escribir y leer 
    // lugar de origen 
    System.out.println("1: Zamora \n2: Loja \n3: otras \n"
            + " Ingrese la ciudad de origen");
    lugar_o = entrada.nextInt();
    // edad actual
    System.out.println("Ingrese su edad ");
    edad = entrada.nextInt();
    // estado civil 
    System.out.println("1: Casado \n2: Soltero \n Ingrese su estado civil altual");
    civil = entrada.nextInt();
    // numero de hijos o carga familiar 
    System.out.println("Ingrese el numero de hijos que tiene ");
    carga_f = entrada.nextInt();
    
    double costo1 = descuentos.des1;
    double costo2 = descuentos.des2;
    double costo3 = descuentos.des3;
    double costo4 = descuentos.des4;
    
    //
    if (lugar_o >= 1 && lugar_o <= 2){ 
      costo = costo1  ;
    }else{
     costo1 = 0;    
    }
    if (edad >017 && edad <=20 ){
      costo = costo2;
    }else{
    costo2 = 0;
    }
    if (civil ==1){
      costo = costo3; 
    }else{
    costo3 = 0;
    }
    if (carga_f >=1){
      costo= costo4;  
    }else{
        costo4 = 0; 
    }
    costof = 1330-(costo1+costo2+costo3+costo4)+(1330*0.02);
    System.out.printf("Su descuento total fue de %s2 \n", costof);
    
  }  
    
}
