/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Exercicio4;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicio4 {
    
    public static void main(String [] args){
        
        int n;
        float h = 0;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        
        for(int i = 1; i <=n ;i++){
            if(i%2 == 0){
                h -=1/(float)i;
            }else{
                h += 1 / (float)i;
            }
        }
        System.out.println("h = "+h);
        
        
    }
}
