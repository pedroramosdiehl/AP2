/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio3;

/**
 *
 * @author Pedro
 */
public class CarroPasseio extends veiculo{
    
    private String cor,modelo;

    public CarroPasseio(String cor, String modelo) {
        this.cor = cor;
        this.modelo = modelo;
    }
    
    public CarroPasseio() {
        cor = "0";
        modelo = "0";
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void printCor(){
        System.out.println(cor);
    }
    
    public void printModelo(){
        System.out.println(modelo);
    }
    
    
}
