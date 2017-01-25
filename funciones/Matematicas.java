/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funciones;

/**
 *
 * Crea una biblioteca de funciones matemáticas que contenga las siguientes
   funciones. Recuerda que puedes usar unas dentro de otras si es necesario.
 * 
 * @author PocyxDesigner
 */
public class Matematicas {
    
    
    
    public static boolean esCapicua2(int n){
        int cont = digitos(n)/2;
        boolean capicua = false;
        for(int i=0;i<cont;i++){
            if(digitoN(n,i)==digitoN(voltea(n),i)){
                capicua=true;
            }
        }
        return capicua;
    }
    
    

    /**
     * Devuelve verdadero si el nÃºmero que se pasa como parÃ¡metro es capicÃºa y
       falso en caso contrario.
     * <p>
     * Un nÃºmero capicÃºa es el que se lee igual de izquierda a derecha que de
     * derecha a izquierda.
     * 
     * @param x nÃºmero del que se quiere saber si es capicÃºa
     * @return  verdadero si el nÃºmero que se pasa como parÃ¡metro es capicÃºa y
     *          falso en caso contrario
     */
    public static boolean esCapicua(long x) {
      return x == voltea(x);
    }

    /**
     * Devuelve verdadero si el nÃºmero que se pasa como parÃ¡metro es capicÃºa y
     * falso en caso contrario.
     * <p>
     * Un nÃºmero capicÃºa es el que se lee igual de izquierda a derecha que de
     * derecha a izquierda.
     *
     * @param x nÃºmero del que se quiere saber si es capicÃºa
     * @return  verdadero si el nÃºmero que se pasa como parÃ¡metro es capicÃºa y
     *          falso en caso contrario
     */
    public static boolean esCapicua(int x) {
      return esCapicua((long)x);
    }

    
    
    /**
     * Devuelve verdadero si el número que se pasa como parámetro
       es capicúa y falso en caso contrario.
     * @param n Número introducido, maximo de cinco cifras.
     * @return true si es capicua
     */
    public static boolean esCapicuaF(int n){
        boolean capicua = false;

        // número de una cifra
        if (n < 10) {
          capicua = true;
        }

        // número de dos cifras
        if ((n >= 10) && (n < 100)) {
          if ((n / 10) == (n % 10)) {
            capicua = true;
          }
        }

        // número de tres cifras
        if ((n >= 100) && (n < 1000)) {
          if ((n / 100) == (n % 10)) {
            capicua = true;
          }
        }

        // número de cuatro cifras
        if ((n >= 1000) && (n < 10000)) {
          if (((n / 1000) == (n % 10)) && ((( n / 100 ) % 10)== (( n / 10) % 10))) {
            capicua = true;
          }
        }

        // número de cinco cifras
        if (n >= 10000) {
          if (((n / 10000) == (n % 10) ) && ((((n / 1000) % 10)) == ((n / 10) % 10))) {
            capicua = true;
          }
        }

        return capicua;
    }
    
    /**
     *Devuelve verdadero si el número que se pasa como parámetro
      es primo y falso en caso contrario. 
     * @param n
     * @return true si es primo
     */
    public static boolean esPrimo(int n){

        for(int p=2;p<=Math.sqrt(n);p++){
            if(n%p==0 ){
                return false;
            }    
        }
        return true;
    }
    
    /**
     * Devuelve el menor primo que es mayor al número que
       se pasa como parámetro.
     * @param n
     * @return num, siguiente número primo al introducido como parametro.
     */
    public static int siguientePrimo(int n){
        int num=n+1;
        do{
            if(esPrimo(num)){
                return num;
            }else if(!esPrimo(num)){
                num++;
            }
        }while(true);
       
    }
    
    /**
     * Dada una base y un exponente devuelve la potencia.
     * @param base
     * @param exponente
     * @return potencia
     */
    public static int potencia(int base, int exponente){
        int potencia=base;
        for(int i=1;i<exponente;i++){
            potencia=potencia*base;
        }
        return potencia;
    }
    
    /**
     * Cuenta el número de dígitos de un número entero.
     * @param n
     * @return contador, número de cifras que tiene n.
     */
    public static int digitos(long n){
        long numero = n;
        int contador = 0;
        do{
            numero = numero/10;
            contador++;
        }while(numero>0);
        return contador;
    }
    
    /**
     * Le da la vuelta a un número.
     * @param n 
     */
    public static long voltea(long n){
        long numero = n;
        long cifra = numero%10;
        long volteado=cifra;
        for(int i=1;i<digitos(n);i++){
            numero = numero/10;
            cifra = (int)numero%10;
            volteado = Integer.valueOf(String.valueOf(volteado) + String.valueOf(cifra));
        }
        return volteado;
    }
    
    /**
     * Devuelve el dígito que está en la posición n de un número
       entero. Se empieza contando por el 0 y de izquierda a derecha.
     * @param numero
     * @param posicion
     * @return n, digito en la posicion indicada
     */
    public static int digitoN(long numero, int posicion){
        int n=0;
        numero = voltea(numero);
        if(posicion==1){
            n=(int)numero%10;
        }
        for(int i=1;i<posicion;i++){
            numero=numero/10;
            n=(int)numero%10;
        }
        
        return n;
    }
    
    /**
     * Da la posición de la primera ocurrencia de un dígito
       dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param numero
     * @param digito
     * @return La posicion del digito indicado.
     */
    public static int posicionDeDigito(long numero, int digito){
        int posicion=1;
        int n=0;
        boolean esta = false;
        numero = voltea(numero);
        if(numero%10==digito){
            return posicion=1;
        }
        do{
            numero=numero/10;
            n=(int)numero%10;
            posicion++;
            if(n==digito){
                esta=true;
                break;
            }
        }while(numero>0);
        if(!esta){
            return -1;
        }
        return posicion;
    }
    
    /**
     * Le quita a un número n dígitos por detrás (por la
       derecha).
     * @param numero
     * @param cantidad
     * @return numero
     */
    public static int quitaPorDetras(int numero, int cantidad){
        int n=0;

        for(int i=0;i<cantidad;i++){
            numero=numero/10;
            n=numero%10;
        }
        return numero;
    }
    
    /**
     * Le quita a un número n dígitos por delante (por la
       izquierda).
     * @param numero
     * @param cantidad
     * @return numero
     */
    public static long quitaPorDelante(long numero, int cantidad){
        int n=0;
        numero = voltea(numero);

        for(int i=0;i<cantidad;i++){
            numero=numero/10;
            n=(int)numero%10;
        }
        return voltea(numero);
    }
    
    /**
     * Añade un dígito a un número por detrás.
     * @param numero
     * @param digito
     * @return pegado
     */
    public static int pegaPorDetras(int numero, int digito){
        int pegado = numero;
        pegado = Integer.valueOf(String.valueOf(pegado) + String.valueOf(digito));
        return pegado;
    }
    
    /**
     * Añade un dígito a un número por delante
     * @param numero
     * @param digito
     * @return pegado
     */
    public static int pegaPorDelante(int numero, int digito){
        int pegado = numero;
        pegado = Integer.valueOf(String.valueOf(digito) + String.valueOf(pegado));
        return pegado;
    }
    
    /**
     * Toma como parámetros las posiciones inicial y final
       dentro de un número y devuelve el trozo correspondiente.
     * @param numero
     * @param inicio
     * @param fin
     * @return 
     */
    public static long trozoDeNumero(int numero, int inicio, int fin){
        int cantidad = digitos(numero);
        int cifra=0;
        for(int i=0;i<cantidad;i++){
            if(i>=inicio && i<=fin){
                numero = numero/10;
                cifra = Integer.valueOf(String.valueOf(cifra) + String.valueOf(numero%10));
            }
        }
        return voltea(cifra);
    }
    
    /**
     * Pega dos números para formar uno.
     * @param numero1
     * @param numero2
     * @return pegado
     */
    public static long juntaNumeros(int numero1, int numero2){
        long pegado = numero1;
        pegado = Long.valueOf(String.valueOf(numero1) + String.valueOf(numero2));
        return pegado;
    }
}
