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
public class Ejer40Tema8 {
    public static int[] filtraCon7(int x[]){
        int[] sietes = new int[x.length];
        for(int i=0;i<x.length;i++){
            for(int e=0;e<digitos(x[i]);e++){
                if(digitoN(x[i],e)==7){
                    sietes[i] = x[i];
                }
            }
        }
        return sietes;
    }
}
