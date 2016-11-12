/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Fibonacci;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testFibonacci {
    
    public static void main(String [] args){
       Fibonacci f1 = new Fibonacci();
    
       Scanner input = new Scanner(System.in);
         
       System.out.println("Insira ate qual casa do fibonacci você deseja");
       int a = input.nextInt();
        
        System.out.println(""+f1.a);
        System.out.println(""+f1.b);
        f1.dofibonacci(a);
    
    }
    
   
}
