/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Conta;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testConta {
    
    public static void main(String[] args){
        
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Cadastre uma nova conta");
        
        System.out.println("Saldo: ");
        c1.setSaldo(input.nextDouble());
        
        System.out.println("Limite: ");
        c1.setLimite(input.nextDouble());
        
        System.out.println("Nome: ");
        input.nextLine();
        c1.setNameOwner(input.nextLine());
        
        System.out.println("Cadastre uma nova conta");
        
        System.out.println("Saldo: ");
        c2.setSaldo(input.nextDouble());
        
        System.out.println("Limite: ");
        c2.setLimite(input.nextDouble());
        
        System.out.println("Nome: ");
        input.nextLine();
        c2.setNameOwner(input.nextLine());
        
        System.out.println("Faça um saque");
        System.out.println("Insira um valor para saque");
        c1.saque(input.nextFloat());
        
        c1.getNome();
        
        System.out.println("Faça um deposito");
        System.out.println("Insira um valor para deposito");
        c1.deposito(input.nextFloat());
        
        System.out.println("Faça uma transferencia");
        System.out.println("Insira um valor para transferencia");
        c1.transferencia(c1,c2,input.nextFloat());
        
        
        
        
        
    }
    
}
