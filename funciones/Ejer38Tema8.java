/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import static funciones.Matematicas.esCapicua;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer38Tema8 {
    /**
     * 
     * @param x
     * @return 
     */
    public static int[] filtraCapicuas(int x[]){
        int[] capicuas = new int[x.length];
        int e=0;
        for(int i=0;i<x.length;i++){
            if(esCapicua(x[i])){
                capicuas[e++]=x[i];
            }
        }
        return capicuas;
    }
}
