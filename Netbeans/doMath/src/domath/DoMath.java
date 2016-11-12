/* FUNÇOES USADAS NÃO ORIGINAIS
*/



package domath;

import static java.lang.Math.sqrt;

public class DoMath {

	public static final double e = 2.7182818284590;
	
	//Potencia --
	public static double pow(double num,int expoente){
		
		double result = 1;
		
		for (int i = 1; i<=expoente; i++){
			result = num * result;
		}
		return result; 
	}
	
	//Fatorial --
	public static double factorial(double num){
		
		if(num == 1){
			return 1;
		}else if(num == 2){
			return 2;
		}else{
			return num * factorial(num - 1);
		}
	}
	
	//Fibonacci
	public static int fibonacci(int num){
		
		return num == 1 || num == 2 ? 1 : fibonacci(num - 1) + fibonacci(num - 2);
		
	}
	
	//Log
	public static double log(double m){
		
		int a = 0;
		double y;
		double ln;
		double logx;
		
		while (!( m >= 1 && m <10)){
			m = m / 10;
			
			a++;
		}
		
		y = (raiz(2,m) - 1) / (raiz(2,m) + 1);
		
		double sum = 0;
		
		for (int i = 1; i<100;i++){
			
			sum += pow(y,i)/i;
			
			i++;
		}
		
		ln = 2 * sum;
		
		logx =  0.86858896*ln + a;
		
		return logx;
	}
	
	//exponencial
	public static double exponencial(double num){
		
		int n = (int) Math.round(num);	// N = INTEIRO MAIS PROXIMO
		double r = num - n;				// R = N - NUM
		
		double en = pow(e,Math.abs(n));
		
		double er = 1;
		
		for(int i= 1;i<50;i++){
			
			er += pow(r,i)/factorial(i);
			
		}
			
		if ( num > 0){
			
			return en * er;	
		}else
			en = (double)1/en;
			return en * er;	
		}
	
	//Ln
	public static double ln(double m){
		
		int a = 0;
		double y;
		double ln;
		
		while (!( m >= 1 && m <10)){
			m = m / 10;
			
			a++;
		}
		
		y = (sqrt(m) - 1)/(sqrt(m) + 1);
		
		double sum = 0;
		
		for (int i = 1; i<=50;i++){
			
			sum += pow(y,i)/i;
			
			i++;
		}
		
		ln = (4 * sum) + (a * 2.3025851);
				
		return ln;
	}
	
	//raiz
	public static double raiz(int n,double s){
		
		double a = ln(s) /(double) n;
		System.out.println(ln(s));
		System.out.println(n);
		System.out.println(ln(s)/(double) n);
		
		return exponencial(a);
	}
}
	

