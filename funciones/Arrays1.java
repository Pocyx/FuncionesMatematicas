/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

import static java.lang.Byte.MAX_VALUE;
import static java.lang.Byte.MIN_VALUE;

/**
 *
 * @author PocyxDesigner
 */
public class Arrays1 {
 
    /**
     * 
     * Genera un array de tamaño n con números aleatorios
       cuyo intervalo (mínimo y máximo) se indica como parámetro.
     * 
     * @param n tamaño del array
     * @param min intervalo aleatorio minimo
     * @param max intervalo aleatorio minimo
     * @return array
     */
    public static int[] generaArrayInt(int n, int min, int max){
        int[] array = new int [n];
        for(int i=0;i<array.length;i++){
            array[i]= (int) (Math.random()*max)+min;
        }
        return array;
    }
    /**
     * 
     * Devuelve el mínimo del array que se pasa como
       parámetro.
     * 
     * @param array
     * @return 
     */
    public static int minimoArrayInt(int[] array){
        int minimo = MAX_VALUE;
        for(int i=0;i<array.length;i++){
            
            if(array[i]<minimo){
                minimo=array[i];
            }
        }
        return minimo;
    }
    /**
     * 
     * Devuelve el máximo del array que se pasa como
       parámetro.
     * 
     * @param array
     * @return 
     */
    public static int maximoArrayInt(int[] array){
        int maximo = MIN_VALUE;
        for(int i=0;i<array.length;i++){
            
            if(array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    /**
     * 
     * Devuelve la media del array que se pasa como parámetro.
     * 
     * @param x
     * @return 
     */
    public static double mediaArrayInt(int[] x){
        int suma=0;
        for(int i=0;i< x.length;i++){
            suma=x[i]+suma;
        }
        int media=suma/x.length;
        return media;
    }
    /**
     * 
     * Dice si un número está o no dentro de un array.
     * 
     * @param n
     * @param array
     * @return 
     */
    public static boolean estaEnArray(int n, int[] array){
        boolean esta = false;
        
        for(int i=0;i< array.length;i++){
            if(n==array[i]){
                esta=true;
            }
        }
        return esta;
    }
    /**
     * 
     * Busca un número en un array y devuelve la posición
       (el índice) en la que se encuentra.
     * 
     * @param n
     * @param array
     * @return si no esta el numero en el array devuelve 0.
     */
    public static int posicionEnArray(int n, int[] array){
        int indice=0;
        for(int i=0;i< array.length;i++){
            if(n==array[i]){
                indice=i+1;
            }
        }
        return indice;
    }
    /**
     * Le da la vuelta a un array.
     * @param array
     * @return 
     */
    public static int[] volteaArrayInt(int[] array){
        int[] volteado=new int[array.length];
        int e=array.length-1;
        for(int i=0;i<array.length ;i++){  
            volteado[e]=array[i];
            e--;
        }
        return volteado;
    }
    /**
     * 
     * Rota n posiciones a la derecha los números de
       un array.
     * 
     * @param n
     * @param array
     * @return 
     */
    public static int[] rotaDerechaArrayInt(int n, int[] array){
        int[] rotado=new int[array.length];
        int e = n;
        int m = 0;
        for(int i=0;i<array.length;i++){
            if(i==0){
                rotado[i] = array[array.length-n];
                }else if (i<array.length-n-i){
                    rotado[i] = array[array.length-n+i];
                }else if (i>=n && i<array.length){
                    rotado[i] = array[m++];
                }else if(i==array.length-1){
                    rotado[i] = array[e++];
                }   
        }                
        return rotado;

    }
}
