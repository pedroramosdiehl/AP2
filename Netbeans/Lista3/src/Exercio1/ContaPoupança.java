/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Exercio1;

public class ContaPoupança extends Conta{
    
    private String diaRendimento;
    private float taxaRendimento;
    
    public void calcularNovoSaldo(){
       setSaldo(getSaldo()*(taxaRendimento/100));
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
    
    
    
}
