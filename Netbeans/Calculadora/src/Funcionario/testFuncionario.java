/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testFuncionario {
    
    public static void main(String [] args){
        //Cria o objeto function
        Funcionario function = new Funcionario();
        //Cria o objeto input
        Scanner input = new Scanner(System.in);
        //Cria objeto data
        Data data = new Data();
        //cria objeto data entrada
        
        System.out.println("Insira os dados do funcionario");
        
        System.out.println("Nome: ");
        function.nome = input.nextLine();
        
        System.out.println("Departamento: ");
        function.dpto = input.next();
        
        System.out.println("Salario: ");
        function.salario = input.nextDouble();
        
        System.out.print("Data de Entrada: ");
        
        data.dia = input.nextInt();
        System.out.print("/");
        data.mes = input.nextInt();
        System.out.print("/");
        data.ano = input.nextInt();
        function.dataEntrada = data;
        
        System.out.println("RG: ");
        function.rg = input.nextInt();
         
        System.out.println("////////////////////////////");
        
        function.imprimirFuncionario();
        
        function.recebeAumento(10);
        
        System.out.println("////////////////////////////");
        
        function.imprimirFuncionario();
        
        System.out.println("Salario Anual: "+function.calculaGanhoAnual());
        
    }
}
