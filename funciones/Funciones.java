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
    }
    
}
