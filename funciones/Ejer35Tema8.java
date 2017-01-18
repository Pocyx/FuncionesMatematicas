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
public class Ejer35Tema8 {
    /**
     * 
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print(convierteEnPalotes(123034509)+"\n");
    }
    
    /**
     * 
     * @param n
     * @return palotes, Esta función convierte el número n al sistema de palotes y lo devuelve en una
        cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
        | - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
        para comprobar que funciona bien. Desde la función no se debe mostrar nada
        por pantalla, solo se debe usar print desde el programa principal.
     */
    public static String convierteEnPalotes(int n){
       String palote="";
       int nDig = Matematicas.digitos(n);
       int digito = 0;
       for(int i=0;i<nDig;i++){
           digito = Matematicas.digitoN(n, i+1);
           
               if(digito!=0){
                   for(int e=0;e<digito;e++){
                      palote = palote + "|"; 
                   }
                   
               }else if(digito==0){
                   palote = palote + "-";
                   
               }
               if(i!=nDig-1 && digito!=0)
               palote = palote + "-";
           
       }
       return palote;
    }
    
}
