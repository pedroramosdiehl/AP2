/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Lista1.Exercicio2;

import static java.lang.Math.pow;

/**
 *
 * @author Pedro
 */
public class Exercicio2 {
    
    public static void main(String[] args){
        int cont = 0;
        
        while(cont <= 10){
            System.out.println(cont+"  "+pow(cont,2)+" "+pow(cont,3));
            cont++;
        }
        
    }
}
