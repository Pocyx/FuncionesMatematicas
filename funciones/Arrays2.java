/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * Crea una biblioteca de funciones para arrays bidimensionales (de dos dimensiones)
   de números enteros que contenga las siguientes funciones:
 * 
 * @author PocyxDesigner
 */
public class Arrays2 {
    
    /**
     * 
     * @param n número de filas
     * @param m número de columnas
     * @param min número mínimo a generar
     * @param max número máximo a generar
     * @return Genera un array de tamaño n x m con números
               aleatorios cuyo intervalo (mínimo y máximo) se indica como parámetro.
     */
    public static int[][] generaArrayBiInt(int n, int m, int min, int max){
        int[][] arrayBi = new int[n][m];
        for (int i=0; i<n;i++){
            //Fila
            for(int e=0;e<m;e++){
                arrayBi[i][e]=(int) (Math.random()*min)+max;
            }
        }
        return arrayBi;
    }
    
    /**
     * 
     * @param fila
     * @param arrayBi
     * @return Devuelve la fila i-ésima del array que se pasa como
               parámetro.
     */
    public static int[] filaDeArrayBiInt(int fila, int[][]  arrayBi){
        int[] arrayFila = new int[arrayBi.length];
        for (int i=0; i<arrayBi.length;i++){
            
            for(int e=0;e<arrayBi[fila].length;e++){
                arrayFila[i] = arrayBi[fila][e];
            }
        }
        return arrayFila;
    }
    
    /**
     * 
     * @param columna
     * @param arrayBi
     * @return Devuelve la columna e-ésima del array que se
               pasa como parámetro.
     */
    public static int[] columnaDeArrayBiInt(int columna, int[][] arrayBi){
        int[] arrayColumna = new int[arrayBi.length];
        for (int i=0; i<arrayBi.length;i++){
            
            for(int e=0;e<arrayBi[columna].length;e++){
                arrayColumna[e] = arrayBi[columna][e];
            }
        }
        return arrayColumna;
    }
    
    public static int[][] coordenadasEnArrayBiInt(int n, int[][] arrayBi){
        //define un array de 10 posiciones
        int [][] array = new int[10];
        //Entramos en cada posición del array.
        for(int i=0;i<array.length;i++){
            //Definimos una variable boolean para saber si esta repetido o no.
            boolean repetido;
            //Definimos la variable que será un número aleatorio entre 1-10.
            int aleatorio=0;
            do{
                repetido = false;
                aleatorio = (int) ((Math.random()*10)+1);
                System.out.println("aleatorio antes del for: "+aleatorio+" ");
                for(int e=0;e<i;e++){
                    System.out.print("array["+e+"]= "+array[e]+" ");
                    if(array[e]==aleatorio){
                        repetido = true;
                    }
                }
                
            }while(repetido);
            array[i]=aleatorio;
            System.out.print("aleatorio no repetido: "+aleatorio+" ");
             
        }
    }
}
