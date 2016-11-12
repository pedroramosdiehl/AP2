/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Listadasala;

/**
 *
 * @author Pedro
 */
public class Pessoa {
    
    private String nome,cpf;
    private int idade;
    private float altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdade() {
        return idade;
    }

    public float getAltura() {
        return altura;
    }
    
    public void printDados(){
        System.out.println(""+nome);
        System.out.println(""+cpf);
        System.out.println(""+idade);
        System.out.println(""+altura);
        
    }
    
    public void classeEleitoral(int a){
        if ( a > 18 & a <= 65){
            System.out.println("Obrigatorio votar!!");
        }else if(a < 16){
            System.out.println("Não pode votar");
        }else if(a > 65 || a < 18 & a >= 16){
            System.out.println("Não é obrigatorio votar");
        }
    }
}
