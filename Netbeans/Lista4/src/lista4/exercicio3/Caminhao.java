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
public class Caminhao extends veiculo{
    
    private float cargaMaxima;
    private int aulturaMax;
    private int comprimento;

    public Caminhao(float cargaMaxima, int aulturaMax, int comprimento) {
        this.cargaMaxima = cargaMaxima;
        this.aulturaMax = aulturaMax;
        this.comprimento = comprimento;
    }
    
    public Caminhao (){
        cargaMaxima = 0;
        aulturaMax = 0;
        comprimento = 0;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getAulturaMax() {
        return aulturaMax;
    }

    public void setAulturaMax(int aulturaMax) {
        this.aulturaMax = aulturaMax;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }
    
    
}
