/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Funcionario;

/**
 *
 * @author Pedro
 */

public class Conta {
    
    private int nConta; 
    private String typeAccount,nameOwner;
    private double saldo,limite;

    public int getnConta() {
        return nConta;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public void setTypeAccount(String typeAccount) {
        this.typeAccount = typeAccount;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public void sacar(float quantia){
    	
    }


}
