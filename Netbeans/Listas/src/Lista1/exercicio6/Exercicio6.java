/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package exercicio6;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicio6 {
    
    public static void main(String[] args){
        
        int n;
        float par = 0;
        float impar = 1;
        
        Scanner input = new Scanner(System.in);
        
        n = input.nextInt();
        
        for(int i = 1; i<=n; i++){
            System.out.println(""+(pow(i,2)));
            if(i%2 == 0){
                par += pow(i,2);
            }else{
                impar *= pow(i,2);
            }
        }
        System.out.println("par : "+par);
        System.out.println("impar: "+impar);
        
        
    }
    
}
