/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio4;

/**
 *
 * @author Pedro
 */
public class Homem extends PessoaIMC{

    public Homem(double peso, double altura, String nome, String dataNascimento) {
        super(peso, altura, nome, dataNascimento);
    }

    @Override
    public String resultIMC() {
        double imc;
        imc = calculaIMC(peso,altura);
        
       if ( imc < 20.7){
           return "Abaixo do peso Ideal";
       }else if (imc > 20.7 || imc < 26.4){
           return "Peso ideal";
       }else if(imc > 26.4){
           return "Acima do peso ideal";
       }else{
        return "erro";
       }
        
    }
    
}
