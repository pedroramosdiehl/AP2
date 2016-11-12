/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Exercicio5;

/**
 *
 * @author Pedro
 */
public class Exercicio5 {
    
    public static void main(String[] args){
        
        float a = 0;
        
        for (int i = 1; i<=10; i++){
               a+= i /(float)(2 * i);
        }
        
        System.out.println("total : "+a);
    }
}
