/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import static funciones.Matematicas.digitoN;
import static funciones.Matematicas.digitos;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer39Tema8 {
    
    public static void main(String[] args) {
        System.out.print(convierteEnPalabras(0123456));
    }
    
    public static String convierteEnPalabras(int n){
        String convertido="";
        String[] letras = {"cero","uno","dos","tres","cuatro","cinco","seis","siete","ocho","nueve"};
        for(int i=0;i<digitos(n);i++){    
            convertido = convertido+", "+letras[digitoN(n,i)];    
        }
        return convertido;
    }
}
