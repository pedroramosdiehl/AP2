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
public class motor {
    
    private int numcilindros;
    private int potencia;
    
    public motor (){
        numcilindros = 0;
        potencia = 0;
    }
    public motor(int numcilindros,int potencia){
        this.numcilindros = numcilindros;
        this.potencia = potencia;
    }

    public int getNumcilindros() {
        return numcilindros;
    }

    public void setNumcilindros(int numcilindros) {
        this.numcilindros = numcilindros;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    
    public int printNumcilindros(){
        return numcilindros;
    }
    
     public int printPotencia(){
        return potencia;
    }
}
