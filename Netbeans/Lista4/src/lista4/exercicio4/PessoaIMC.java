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
public abstract class PessoaIMC extends Pessoa{
    
    protected double peso;
    protected double altura;

    public PessoaIMC(double peso, double altura, String nome, String dataNascimento) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }
    
    public double calculaIMC(double peso,double altura){
        return peso / ( altura * altura);
    }
    
    public abstract String resultIMC();
    
    public void printPeso(){
        System.out.println("Nome: "+getNome());
        System.out.println("Data de Nascimento: "+getDataNascimento());
        System.out.println("Peso: "+peso);
        System.out.println("Altura: "+altura);
    }
    
}
