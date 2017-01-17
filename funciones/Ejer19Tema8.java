/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * Une y amplía los dos programas anteriores de tal forma que se permita
   convertir un número entre cualquiera de las siguientes bases: decimal, binario,
   hexadecimal y octal.
 * 
 * @author PocyxDesigner
 */
public class Ejer19Tema8 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Elige para pasar de:\n 1:Binario a decimal\n 2:Decimal a binario\n");
        int elige = Integer.parseInt(sc.nextLine());
        switch(elige){
            case 1:
                System.out.print("Introduce un numero binario: ");
                long bin = Long.parseLong(sc.nextLine());
                System.out.println(binarioDecimal(bin));
                break;
            case 2:
                System.out.print("Introduce un numero entero: ");
                int dec = Integer.parseInt(sc.nextLine());
                System.out.println(decimalBinario(dec));
                break;
        }
    }
    
    public static long binarioDecimal(long bin) {
    long numero, aux, digito, decimal;
     int exponente;
     boolean esBinario;
     //Scanner sc = new Scanner(System.in);

    //Leer un número por teclado y comprobar que es binario
     do {
          
          numero = bin;
          //comprobamos que sea un número binario es decir
          //que este formado solo por ceros y unos
          esBinario = true;
          aux = numero;
          while (aux != 0) {
                     digito = aux % 10; //última cifra del números
                     if (digito != 0 && digito != 1) { //si no es 0 ó 1
                          esBinario = false; //no es un número binario
                     }
                     aux = aux / 10; //quitamos la última cifra para repetir el proceso
           }
      } while (!esBinario); //se vuelve a pedir si no es binario

      //proceso para pasar de binario a decimal
      exponente = 0;
      decimal = 0; //será el equivalente en base decimal
      while (numero != 0) {
                //se toma la última cifra
                digito = numero % 10;
                //se multiplica por la potencia de 2 correspondiente y se suma al número
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                //se aumenta el exponente
                exponente++;
                //se quita la última cifra para repetir el proceso
                numero = numero / 10;
      }
      return decimal;
      
   }
    
    public static long decimalBinario(int dec) {

        int numero, exp, digito;
        double binario;

        do{  
            
            numero = dec;
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        return (long) binario;
        
    }
}
