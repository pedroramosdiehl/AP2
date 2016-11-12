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
public class Mulher extends PessoaIMC{

    public Mulher(double peso, double altura, String nome, String dataNascimento) {
        super(peso, altura, nome, dataNascimento);
    }

    @Override
    public String resultIMC() {
       double imc;
       imc = calculaIMC(peso,altura);
       
       if ( imc < 19){
           return "Abaixo do peso Ideal";
           
       }else if (imc > 19 || imc < 25.8){
           return "Peso ideal";
       }else if(imc > 25.8){
           return "Acima do peso ideal";
       }else{
           return "erro";
       }
    }
}
