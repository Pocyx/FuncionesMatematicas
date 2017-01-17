/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * Muestra los números capicúa que hay entre 1 y 99999.
 * 
 * @author PocyxDesigner
 */
public class Ejer16Tema8 {
    public static void main(String[] args) {
        for(int i=1;i<=99999;i++){
            if(Matematicas.esCapicua(i)){
                System.out.println(i);
            }
        }
    }
}
