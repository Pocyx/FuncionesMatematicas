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
public class Funciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Matematicas//
        System.out.println("esCapicua "+Matematicas.esCapicua(1321));
        System.out.println("esPimo "+Matematicas.esPrimo(5));
        System.out.println("siguiente primo "+Matematicas.siguientePrimo(5));
        System.out.println("potencia "+Matematicas.potencia(3, 3));
        System.out.println("digitos "+Matematicas.digitos(1234));
        System.out.println("voltea "+Matematicas.voltea(1234567890));
        System.out.println("digitoN "+Matematicas.digitoN(4567, 3));
        System.out.println("posicionDeDigito "+Matematicas.posicionDeDigito(46987, 9));
        System.out.println("quitaPorDetras "+Matematicas.quitaPorDetras(12345, 2));
        System.out.println("quitaPorDelante "+Matematicas.quitaPorDelante(12345, 2));
        System.out.println("pegarPorDetras "+Matematicas.pegaPorDetras(12345, 2));
        System.out.println("pegarPorDelante "+Matematicas.pegaPorDelante(12345, 2));
        System.out.println("trozoNumero "+Matematicas.trozoDeNumero(123456, 2, 4));
        System.out.println("juntaNumeros "+Matematicas.juntaNumeros(1234511, 2494611));
        //Arays1//
        System.out.println();
        System.out.println("Funciones de array1\n");
        int n = 7;//tamaño de array
        int[] arrayUno = Arrays1.generaArrayInt(n, 1, 10);
        System.out.print("generaArrayInt ");
        for(int i=0;i<n;i++){
            System.out.print(arrayUno[i]+", ");
        }
        System.out.println();
        System.out.println("minimoArrayInt "+Arrays1.minimoArrayInt(arrayUno));
        System.out.println("maximoArrayInt "+Arrays1.maximoArrayInt(arrayUno));
        System.out.println("mediaArrayInt "+Arrays1.mediaArrayInt(arrayUno));
        System.out.println("estaEnArray "+Arrays1.estaEnArray(2,arrayUno));
        System.out.println("posicionEnArray "+Arrays1.posicionEnArray(2,arrayUno));
        System.out.print("volteaArrayInt ");
        int[] arrayDos = Arrays1.volteaArrayInt(arrayUno);
        for(int i=0;i<n;i++){
            System.out.print(arrayDos[i]+", ");
        }
        System.out.println();
        System.out.print("rotaDerechaArrayInt ");
        int[] arrayTres = Arrays1.rotaDerechaArrayInt(3, arrayDos);
        for(int i=0;i<n;i++){
            System.out.print(arrayTres[i]+", ");
        }
        System.out.println();

        System.out.print("rotaIzquierdaArrayInt ");
        int[] arrayCuatro = Arrays1.rotaIzquierdaArrayInt(3, arrayDos);
        for(int i=0;i<n;i++){
            System.out.print(arrayCuatro[i]+", ");
        }
        System.out.println();
        
        System.out.println("\nFunciones de array2\n");
        int[][] arrayBiUno = Arrays2.generaArrayBiInt(10, 10, 100, 200);
        System.out.print("generaArrayBiInt \n");
        for(int i=0;i<arrayBiUno.length;i++){
            for(int e=0;e<arrayBiUno[i].length;e++){
                System.out.print(arrayBiUno[i][e]+", ");
            }
            System.out.println();
        }
        System.out.print("filaDeArrayBiInt \n");
        int[] fila = Arrays2.filaDeArrayBiInt(3, arrayBiUno);
        for(int i=0;i<arrayBiUno[0].length;i++){
            System.out.print(fila[i]+", ");
        }
        System.out.println();
        
        System.out.print("columnaDeArrayBiInt \n");
        int[] columna = Arrays2.columnaDeArrayBiInt(3, arrayBiUno);
        for(int i=0;i<arrayBiUno.length;i++){
            System.out.print(columna[i]+", ");
        }
        System.out.println();
        
        System.out.print("coordenadasDeArrayBiInt \n");
        int[] coordenadas = Arrays2.coordenadasEnArrayBiInt(130, arrayBiUno);
        for(int i=0;i<coordenadas.length;i++){
            System.out.print(coordenadas[i]+", ");
        }
        System.out.println();
        
        System.out.print("esPuntoDeSilla \n");
        System.out.println(Arrays2.esPuntoDeSilla(130, arrayBiUno));
        
        System.out.println();
        
        System.out.print("diagonal \n");
        int[] diagonal = Arrays2.diagonal(1, 2, "neso", arrayBiUno);
        for(int i=0;i<diagonal.length;i++){
            System.out.print(diagonal[i]+", ");
        }
        System.out.println();
    }
    
}

