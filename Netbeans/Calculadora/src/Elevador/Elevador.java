/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Elevador;

/**
 *
 * @author Pedro
 */
public class Elevador {
    
    private int andarAtual = 0;
    private int andarTotal;
    private int capacidade;
    private int lotacao = 0;

    public void inicializa(int andarTotal, int capacidade) {
        this.andarTotal = andarTotal;
        this.capacidade = capacidade;
    }
    
    public void entra (){
        if (lotacao < capacidade){
            lotacao++;
        }else{
            System.out.println("Elevador Lotado !! ");
        }
    }
    public void sai(){
        if(lotacao >= 1){
            lotacao--;
        }else{
            System.out.println("Impossivel remover uma pessoa");
        }
    }
    public void sobe(){
        if(andarAtual < andarTotal){
            andarAtual++;
        }else{
            System.out.println("Impossivel subir de andar");
        }
    }
    
    public void desce(){
        if(andarAtual > 0){
            andarAtual--;
        }else{
            System.out.println("Impossivel desce de andar");
        }
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public void setAndarTotal(int andarTotal) {
        this.andarTotal = andarTotal;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public int getAndarTotal() {
        return andarTotal;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getLotacao() {
        return lotacao;
    }
    
    
    
}
