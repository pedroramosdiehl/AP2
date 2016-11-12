/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Funcionario;

/**
 *
 * @author Pedro
 */
public class Funcionario {
    String nome, dpto;
    double salario;
    int rg;
    
    Data dataEntrada;
    
    
    void recebeAumento(double porcentagem){
        salario += salario * (porcentagem / 100);
    }
    
    double calculaGanhoAnual(){
        return salario*12;
    }
    
    void imprimirFuncionario(){
        System.out.println("Nome: "+nome);
        System.out.println("Departamento: "+dpto);
        dataEntrada.informaData();
        System.out.println("RG: "+rg);
        System.out.println("Salario: "+salario);
        
    }
}
