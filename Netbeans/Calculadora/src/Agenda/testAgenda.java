/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Agenda;

//import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class testAgenda {
    
    public static void main(String [] args){
        
        Agenda a1 = new Agenda();
        
        System.out.println("1 - ");
        //INICIOU A AGENDA
        a1.startAgenda(10); 
        
        System.out.println("2 - ");
        //CADASTROU 3 USUARIOS
        a1.newUser("Pedro","00000000000"); // FUNCIONOU !!
        a1.newUser("Joao","10000000000"); // FUNCIONOU !!
        a1.newUser("Manolo","11000000000"); // FUNCIONOU !!
       
        System.out.println("3 - ");
        //PESQUISA O USUARIO PEDRO
        a1.searchUser("00000000000"); // FUNCIONOU !!
        
        System.out.println("4 - ");
        //REMOVE O USUARIO PEDRO
        a1.removeUser("Pedro"); // FUNCIONOU !!
        
        System.out.println("5 - ");
        //DEVE IMPRIMIR OS DADOS DO JOAO
        a1.printData("10000000000"); // FUNCIONOU
        
        System.out.println("6 - ");
        //NAO DEVE PRINTAR O PEDRO
        a1.allUsers(); // FUNCIONOU !!
        
        
        
        
        
    }
}
