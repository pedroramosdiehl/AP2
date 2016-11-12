/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Fibonacci;

/**
 *
 * @author Pedro
 */
public class Fibonacci {
      
       double cont = 2;
       double a=0,b=1,c=0;
        
       public int dofibonacci(int max){
           
           c = a + b;
           a = b;
           b = c;
          
           
           if (cont >= max){
               return 0;
           }else{
               cont++;
                System.out.println(""+c);
               return dofibonacci(max);
           }
           
           //cont >= max ? return 0 : return dofibonacci(max);
           
           //return dofibonnaci();
           
       }
    
}
