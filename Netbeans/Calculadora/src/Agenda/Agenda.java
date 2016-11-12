/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Agenda;

import Pessoa.Pessoa;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class Agenda {
    
    Pessoa[] user;
    private int cont = 0;
    
    public void startAgenda(int a){
        user = new Pessoa[a];
        
    }
    
    public void newUser(String nome,String cpf){
        
        user[cont] = new Pessoa();
        
        user[cont].setNome(nome);
        user[cont].setCpf(cpf);
        System.out.println(""+user[cont].getNome()+" / "+user[cont].getCpf()+" - Cadastrado com Sucesso !!");
        cont++;
    }
        
    public void searchUser(String cpf){
        
        for (int i = 0; i<=cont; i++){
            if(cpf.equals(user[i].getCpf())){
                System.out.println(""+user[i].getNome());
                break;
            }
        } 
    }
    
    public void removeUser(String nome){
        for (int i = 0; i<=cont; i++){
            if(nome.equals(user[i].getNome())){
              // user[i] = new Pessoa();
                user[i].setCpf("\n");
                user[i].setNome("\n");
                break;
            }
        } 
        
    }
    
    public void allUsers(){
        
        for(int i = 0; i<cont;i++){
            if(user[i].getNome().equals("\n")){ 
            } else {
                System.out.println(""+user[i].getNome()+" - "+user[i].getCpf());
            }
        }
    }   
    
    public void printData(String cpf){
        
        for (int i = 0; i<=cont; i++){
            if(cpf.equals(user[i].getCpf())){
                System.out.println(""+user[i].getNome()+" - "+user[i].getCpf());
                break;
            }
        } 
    }
}

    
 