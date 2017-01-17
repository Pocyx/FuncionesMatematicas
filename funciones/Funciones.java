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
        System.out.println("esCapicua "+Matematicas.esCapicua(12321));
        System.out.println("esPimo "+Matematicas.esPrimo(5));
        System.out.println("siguiente primo "+Matematicas.siguientePrimo(5));
        System.out.println("potencia "+Matematicas.potencia(3, 3));
        System.out.println("digitos "+Matematicas.digitos(1234));
        System.out.println("voltea "+Matematicas.voltea(1234567));
        System.out.println("digitoN "+Matematicas.digitoN(4567, 3));
        System.out.println("posicionDeDigito "+Matematicas.posicionDeDigito(46987, 1));
        System.out.println("quitaPorDetras "+Matematicas.quitaPorDetras(12345, 2));
        System.out.println("quitaPorDelante "+Matematicas.quitaPorDelante(12345, 2));
        System.out.println("pegarPorDetras "+Matematicas.pegaPorDetras(12345, 2));
        System.out.println("pegarPorDelante "+Matematicas.pegaPorDelante(12345, 2));
        System.out.println("trozoNumero "+Matematicas.trozoDeNumero(123456, 2, 4));
        System.out.println("juntaNumeros "+Matematicas.juntaNumeros(12345, 24946));
        //Arays1//
        System.out.println();
        System.out.println("Funciones de array\n");
        int n = 5;//tamaño de array
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
        int[] arrayTres = Arrays1.rotaDerechaArrayInt(2, arrayDos);
        for(int i=0;i<n;i++){
            System.out.print(arrayTres[i]+", ");
        }
        System.out.println();
    }
    
}
