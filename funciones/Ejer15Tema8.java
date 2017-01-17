/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * Muestra los números primos que hay entre 1 y 1000.
 * 
 * @author PocyxDesigner
 */
public class Ejer15Tema8 {
    public static void main(String[] args) {
        for(int i=1;i<=1000;i++){
            if(Matematicas.esPrimo(i)){
                System.out.println(i);
            }
        }
    }
}
