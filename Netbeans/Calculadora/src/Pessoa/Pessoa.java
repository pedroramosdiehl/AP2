/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Pessoa;

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
    
}
