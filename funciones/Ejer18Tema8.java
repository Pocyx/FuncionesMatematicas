/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import java.util.Scanner;

/**
 *
 * Escribe un programa que pase de decimal a binario.
 * 
 * @author PocyxDesigner
 */
public class Ejer18Tema8 {
    public static void main(String[] args) {

        int numero, exp, digito;
        double binario;
        Scanner sc = new Scanner(System.in);

        do{  
            System.out.print("Introduce un numero entero: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario = binario + digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.printf("Binario: %.0f %n", binario);
    }
}
