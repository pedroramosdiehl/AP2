/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista6;

/**
 *
 * @author Pedro
 */
public class Ex4 {
	
	public static void main(String [] args){
		String[] a = {"ABC","123","0",""};
		
		for ( int i = 0 ; i <= 4 ; i++){
			
			try{
				String s = a[i];
				System.out.println("\ts: "+s);

				int n = Integer.parseInt(s);

				System.out.println("\ts: "+n);

				int m = 1234/n;

				System.out.println("\tm: "+m);
				System.out.println("Adeus.");
			}catch(java.lang.NumberFormatException e){
				System.out.println("Impossivel conversão");
			}catch(java.lang.ArithmeticException e){
				System.out.println("Impossivel divisão");
			}catch(java.lang.ArrayIndexOutOfBoundsException e){
				System.out.println("Array excedido");
			}
		}
	}
		
}
