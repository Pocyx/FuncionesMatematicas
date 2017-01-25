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
public class Ejer37Tema8 {
    
    public static void main(String[] args) {
        System.out.print(convierteEnMorse(1234567890));
    }
    
    public static String convierteEnMorse(long n){
        String morse = "";
        
        int nDig = Matematicas.digitos(n);
        int digito = 0;
        for(int i=0;i<nDig;i++){
            digito = Matematicas.digitoN(n, i+1);

                if(digito>=1 && digito <=5){
                    for(int e=0;e<digito;e++){
                       morse = morse + "·"; 
                    }
                    for(int e=0;e<5-digito;e++){
                        morse = morse + "-";
                    }

                }else if(digito==0){
                    morse = morse + "-----";

                }else if(digito>=6 && digito<=9){
                    for(int e=0;e<digito-5;e++){
                       morse = morse + "-"; 
                    }
                    for(int e=digito;e<10;e++){
                        morse = morse + "·";
                    }
                }
                

        }
        
        return morse;
    }
}
