/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Listadasala;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class exercicio2 {
                
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
    
        String[] nomes = new String[10];
        String busca;
        
        for(int i = 0; i < 10 ; i++){
            nomes[i] = input.next();
        }
        
        System.out.println("Pesquise um nome");
        
        input.nextLine();
        busca = input.nextLine();
        
        for(int i = 0; i < 10; i++){
            
            if(nomes[i].equals(busca)){
                System.out.println("Pessoa encontrada");
                break;
            }else{
                System.out.println("Pessoa não encontrada!!");
            }
        }  
    }
    
    
}
