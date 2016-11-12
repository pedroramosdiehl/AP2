/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Elevador;

/**
 *
 * @author Pedro
 */
public class testElevador {
    
    public static void main(String [] args){
        
        Elevador e1 = new Elevador();
        
        e1.inicializa(2, 5);
        
        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        e1.entra();
        System.out.println("Ja entraram 5 pessoas");
        e1.entra();
        
        e1.sai();
        e1.sai();
        e1.sai();
        e1.sai();
        e1.sai();
        System.out.println("Ja sairam 5 pessoas");
        e1.sai();
        
        e1.sobe();
        e1.sobe();
        System.out.println("Ja subiu o maximo");
        e1.sobe();
        
        e1.desce();
        e1.desce();
        System.out.println("Ja desceu o maximo");
        e1.desce();
        
        
        
    }
}
