/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 * 201611880
 */
package Lista1.Exercicio1;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Exercicio1 {
    
    public static void main(String[] args){
        
        int a,b,c;
        int menor,maior;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira três inteiros");
        
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        
        System.out.println("Soma: "+(a+b+c));
        System.out.println("Média: "+((a+b+c)/3));
        System.out.println("Produto: "+(a*b*c));
        
        menor = maior = a;
        
        if(menor > b){
            menor = b;
            if(menor > c){//a > b > c
                menor = c;
                maior = a;
            }else if(c > a){ //c > a > b 
                maior = c;
            }  
        }else if(b > c){ // b > a & b > c
            maior = b;
        }else{ // c > b > a
            maior = c;
        }
        System.out.println("menor: "+menor);
        System.out.println("maior: "+maior);
    }       
}
//a<c<b
