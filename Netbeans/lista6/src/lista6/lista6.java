/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista6;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Pedro
 */
public class lista6 {

	Scanner input = new Scanner(System.in);
	
	public double calcular(int i, int j){
		
		if(j == 0){
			JOptionPane.showMessageDialog(null,"impossivel divisão por 0");
			return 0;
			
		}else{
		double result = (double) i /j;
		
		return result;
		}	
	}
	
	public void intVerify(){
		
		boolean flag = true;
		
		while(flag){
			
			System.out.println("Digite um inteiro");
			
			try{
				input.nextLine();
				int a = input.nextInt();
				System.out.println(""+a);
				
				flag = false;
				
			}catch(Exception e){
				JOptionPane.showMessageDialog(null,"Este não é um inteiro numérico");
			}
			
		}
	}
	
	public void exercicio3(){
		
		int[] a = new int[3];

		try{
			for(int i = 0; i<4; i++){
				a[i] = i;	
				System.out.println(""+a[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e){
			JOptionPane.showMessageDialog(null,"ArrayIndexOutOfBoundsException","ERRO !",1);
		}
	}
	
}