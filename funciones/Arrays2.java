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
                arrayBi[i][e]=(int) (Math.random()*(max-min))+min;
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
        int[] arrayFila = new int[arrayBi[0].length];
        for (int i=0; i<arrayBi[0].length;i++){
            arrayFila[i] = arrayBi[fila][i];     
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
            arrayColumna[i] = arrayBi[i][columna];   
        }
        return arrayColumna;
    }
    
    /**
     * 
     * @param n número a comprobar en el array.
     * @param array
     * @return Devuelve la fila y la columna (en un array
               con dos elementos) de la primera ocurrencia de un número dentro de un
               array bidimensional. Si el número no se encuentra en el array, la función
               devuelve el array {-1, -1}.
     */
    public static int[] coordenadasEnArrayBiInt(int n, int[][] array){
        //define un array de 10 posiciones
        int [] coordenadas = new int[2];
        //Definimos una variable boolean para saber si esta repetido o no.
        boolean repetido=false;
        //Entramos en cada posición del array.
        for(int i=0;i<array.length;i++){
            for(int e=0;e<array[i].length;e++){
                if(array[i][e]==n){
                    repetido = true;
                    coordenadas[0]=i;
                    coordenadas[1]=e;
                    break;
                }

            }
            
        }
        if(!repetido){
            coordenadas[0]=-1;
            coordenadas[1]=-1;
            return coordenadas;
        }
        return coordenadas;
    }
    
    /**
     * 
     * @param n
     * @param array
     * @return 
     */
    public static boolean esPuntoDeSilla(int n, int[][] array){
        boolean puntoSilla = false;
        for(int i=0;i<array.length;i++){
            for(int e=0;e<array[i].length;e++){
                if((Arrays1.minimoArrayInt(Arrays2.filaDeArrayBiInt(i, array))==n) && 
                   (Arrays1.maximoArrayInt(Arrays2.columnaDeArrayBiInt(e, array))==n)){
                    puntoSilla = true;
                }
            }
            
        }
        return puntoSilla;       
    }
    
    /**
     * 
     * @param fila
     * @param columna
     * @param direccion nose o neso
     * @param array
     * @return 
     */
    public static int[] diagonal(int fila, int columna, String direccion, int[][] array){
        int [] diagonal = new int[array.length];
        if(direccion == "nose"){
            for(int f=0;f<array.length;f++){
                for(int c=0;c<array[f].length;c++){
                    if(fila==f && columna==c){
                        diagonal[f] = array[f][c];
                        fila=f+1;
                        columna=c+1;
                    }   
                }
            }
        }else if(direccion == "neso"){
            for(int f=0;f<array.length;f++){
                for(int c=0;c<array[f].length;c++){
                    if(fila==f && columna==c){
                        diagonal[f] = array[f][c];
                        fila=f+1;
                        columna=c-1;
                    }   
                }
            }
        }
        
        return diagonal;
    }
}
