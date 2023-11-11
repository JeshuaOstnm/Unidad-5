/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica.pkg1.u5.metodos;

/**
 *
 * @author hola
 */
public class metodos {

    /**
     * @param args the command line arguments
     */
    public static int sumar(int n1, int n2){
        return n1 + n2;
    }

    public static int restar(int n1, int n2){
        return n1 - n2;
    }

    public static int multiplicacion(int n1, int n2){
        return n1 * n2;
    }

    public static double dividir(int n1, int n2){
        return n1 / n2;
    }
    
    public static void main(String[] args){
        int resulsuma = sumar(5,3);
        System.out.println("El resultado de la suma es: " + resulsuma);
        
        int resulresta = restar(8,3);
        System.out.println("El resultado de la resta es: " + resulresta);
        
        int resulmulti = multiplicacion(9,5);
        System.out.println("El resultado de la multiplición es: " + resulmulti);
        
        double resuldivision = dividir(10,2);
        System.out.println("El resultado de la división es: " + resuldivision);
    }
}
