/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio3;
/**
 *
 * 
 */
public class veiculo{

    private double peso;
    private int veloMax;
    private double preço;
    
    public veiculo(){
        
    }
    
    public veiculo (double peso,int veloMax,double preço){
        this.peso = peso;
        this.preço = preço;
        this.veloMax = veloMax;
    }
   
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getVeloMax() {
        return veloMax;
    }

    public void setVeloMax(int veloMax) {
        this.veloMax = veloMax;
    }

    public double getPreço() {
        return preço;
    }

    public void setPreço(double preço) {
        this.preço = preço;
    }
    
    public double printPreço(){
        return preço;
    }
    
    public int printVeloMax(){
        return veloMax;
    }
    
    public double printPeso(){
        return peso;
    }
    
}
