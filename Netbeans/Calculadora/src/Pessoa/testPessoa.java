/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Pessoa;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testPessoa {
    
    public static void main(String[] args){
        
        Pessoa p1 = new Pessoa();
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Insira os dados de uma pessoa");
        
        System.out.println("Nome: ");
        p1.setNome(input.nextLine());
        
        System.out.println("CPF: ");
        p1.setCpf(input.nextLine());
        
        System.out.println("Idade: ");
        p1.setIdade(input.nextInt());
        
        System.out.println("Altura: ");
        p1.setAltura(input.nextFloat());
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("CPF: "+p1.getCpf());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
    }
    
}
