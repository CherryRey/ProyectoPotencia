/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectopotencia;
import java.util.Scanner;

/**
 *
 * @author cherry
 */
public class ProyectoPotencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //¿Qué es la potencia?
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduzca la base");
        int base = sc.nextInt();
        System.out.println("Introduzca el exponente");
        int exponente = sc.nextInt();
        System.out.println("El valor de la potencia"+base+"^"+exponente+"="+Math.pow(base,exponente));
        System.out.println("El valor de la potencia"+base+"^"+exponente+"="+ potenciaIterativa(base,exponente));
        System.out.println("El valor de la potencia"+base+"^"+exponente+"="+ potenciaRecursiva(base,exponente));
    }
    public static double potenciaIterativa(int x, int y){
        int resultado = 1;
        for (int i=0; i < y; i++){
            resultado = resultado*x;
        }
        return resultado;
    }
    public static double potenciaRecursiva(int x, int y){
        if(y==0){return 1;} //caso base
        else{ return x * potenciaRecursiva(x,y-1);} //llama a la propia función y va multiplicando cada vez hasta que llega a 0
    }
}
