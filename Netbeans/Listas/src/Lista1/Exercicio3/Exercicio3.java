/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicio3 {
    
    public static void main(String [] args){
        
        float a;
        int positivos = 0,negativos = 0,zeros = 0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira 5 Valores");
        
        for(int i = 0; i<5; i++){
            a = input.nextFloat();
            
            if(a >=  0){
                positivos++;
            }else{
                negativos++;
            }
            if(a == 0 ){
                zeros++;
            }
        }
        
        System.out.println("Positivos : "+positivos);
        System.out.println("Negativos : "+negativos);
        System.out.println("Zeros : "+zeros);
    }
    
}
