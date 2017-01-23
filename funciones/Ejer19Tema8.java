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
        System.out.print("Elige para pasar de:\n 1:Binario a decimal\n 2:Decimal a binario\n"
                + " 3:Decimal a hexadecimal\n 4:Binario a hexadecimal\n 5:Hexadecimal a decimal\n 6:Hexadecimal a binario\n");
        int elige = Integer.parseInt(sc.nextLine());
        switch(elige){
            case 1:
                System.out.print("Introduce un numero binario para pasarlo a decimal: ");
                long bin = Long.parseLong(sc.nextLine());
                System.out.println(binarioDecimal(bin));
                break;
            case 2:
                System.out.print("Introduce un numero decimal para pasarlo a binario: ");
                int dec = Integer.parseInt(sc.nextLine());
                System.out.println(decimalBinario(dec));
                break;
            case 3:
                
                System.out.print("Introduce un numero decimal para pasarlo a hexadecimal:");
                dec = Integer.parseInt(sc.nextLine());
                System.out.println(decToHex(dec));
                break;
            case 4:
                System.out.print("Introduce un numero binario para pasarlo a hexadecimal: ");
                bin = Long.parseLong(sc.nextLine()); 
                dec=(int) (binarioDecimal(bin));
                System.out.println(decToHex(dec));
                break;
            case 5:
                System.out.print("Introduce un numero hexadecimal para pasarlo a decimal: ");
                String hexa = sc.nextLine();
                System.out.println(hex2decimal(hexa));
                break;
            case 6:
                System.out.print("Introduce un numero hexadecimal para pasarlo a binario: ");
                hexa = sc.nextLine();
                dec = hex2decimal(hexa);
                System.out.println(decimalBinario(dec));
                break;
        }
    }
    
    /**
     * 
     * @param bin
     * @return 
     */
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
    
    /**
     * 
     * @param dec
     * @return 
     */
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
    
 
    private static final int sizeOfIntInHalfBytes = 8;
    private static final int numberOfBitsInAHalfByte = 4;
    private static final int halfByte = 0x0F;
    private static final char[] hexDigits = { 
          '0', '1', '2', '3', '4', '5', '6', '7', 
          '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
    };
    
    /**
     * 
     * @param dec
     * @return 
     */
    public static String decToHex(int dec) {
        StringBuilder hexBuilder = new StringBuilder(sizeOfIntInHalfBytes);
        hexBuilder.setLength(sizeOfIntInHalfBytes);
            for (int i = sizeOfIntInHalfBytes - 1; i >= 0; --i)
            {
              int j = dec & halfByte;
              hexBuilder.setCharAt(i, hexDigits[j]);
              dec >>= numberOfBitsInAHalfByte;
            }
        return hexBuilder.toString(); 
    }
    
    public static int hex2decimal(String s) {
        String digits = "0123456789ABCDEF";
        s = s.toUpperCase();
        int val = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int d = digits.indexOf(c);
            val = 16*val + d;
        }
        return val;
    }
    
}
