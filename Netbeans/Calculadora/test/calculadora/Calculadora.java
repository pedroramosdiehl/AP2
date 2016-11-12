package calculadora;

/**
 *
 * @author Pedro
 */

import java.util.Scanner;

public class Calculadora {
    
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       float a;
       float b;
       
       System.out.println("Insira dois Valores");
       
       a = input.nextFloat();
       b = input.nextFloat();
       
       System.out.println("Soma: "+(a+b));
       System.out.println("Subtração: "+(a-b));
       System.out.println("Divisão: "+(a/b));
       System.out.println("Multiplicação: "+(a*b));
       
    }
    
}
