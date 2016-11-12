/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Listadasala;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class exercicio4 {
    
    public static void main(String [] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira sua idade vacilão!!");
        
        Pessoa p1 = new Pessoa();
        
        p1.classeEleitoral(input.nextInt());
        }
    
}
