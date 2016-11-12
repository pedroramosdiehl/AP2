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
public class Pessoa {
    
    private String nome;
    private String dataNascimento;

    public Pessoa(String nome, String dataNascimento) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public void printPessoa(){
        System.out.println("Nome: "+nome);
        System.out.println("Data de Nascimento: "+dataNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    
}
