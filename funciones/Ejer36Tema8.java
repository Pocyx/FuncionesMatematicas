/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * @author PocyxDesigner
 */
public class Ejer36Tema8 {
  
    
    /**
     * 
     * Utiliza esta función en un programa para comprobar que funcionan bien. Para
       que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
       decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
       también estará repetido 3 veces. Si no existe ningún número primo en x, se
       devuelve un array con el número -1 como único elemento.
     * 
     * @param x
     * @return primos, array con losnumeros primos encontrados.
     */
    public static int[] filtraPrimos(int x[]){
        int[] primos = new int[x.length];
        for(int i=0;i<x.length;i++){
            if(Matematicas.esPrimo(x[i])){
                primos[i]=x[i];
            }
        }
        return primos;
    }
}
