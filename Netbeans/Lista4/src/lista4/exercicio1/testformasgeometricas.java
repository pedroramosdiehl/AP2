/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testformasgeometricas {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        //QUADRILATERO
        Quadrilatero q1 = new Quadrilatero(2,4);
        
        System.out.println(q1.area());
        System.out.println(q1.perimetro());
        
        //TRIANGULO ISOSCELESS
        Triangulo t1 = new Triangulo(2,4);
        
        System.out.println(t1.area());
        System.out.println(t1.perimetro());
        
        //CIRCULO 
        Circulo c1 = new Circulo(1);
        
        System.out.println(c1.area());
        System.out.println(c1.perimetro());
        
    }
    
}
