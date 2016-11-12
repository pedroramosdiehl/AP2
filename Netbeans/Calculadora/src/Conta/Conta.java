/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package Conta;

/**
 *
 * @author Pedro
 */

public class Conta {
    
    private int nConta; 
    private String typeAccount,nameOwner;
    private double saldo,limite;

    public Conta() {
    }
    
    public void saque(float quantia){
        if(quantia > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= quantia;
            System.out.println("Saque efetuado com sucesso!!");
            System.out.println("Saldo atual: "+saldo);
        }
    }
    
    public void deposito(float quantia){
        saldo +=quantia;
        System.out.println("Deposito efetuado com sucesso!!");
        System.out.println("Saldo atual: "+saldo);
        
    }

    public void getNome() {
        System.out.println(""+nameOwner);
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTypeAccount() {
        return typeAccount;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void transferencia(Conta c1,Conta c2, float quantia){
        
        double b,a;
        
        System.out.println("Saldo conta c1: "+c1.getSaldo());
        System.out.println("Saldo conta c2: "+c2.getSaldo());
        
        b = c2.getSaldo();
        a = c1.getSaldo();
        
        a -= quantia;
        b += quantia;
        
        c2.setSaldo(b);
        c1.setSaldo(a);
        
        System.out.println("Saldo conta c1: "+c1.getSaldo());
        System.out.println("Saldo conta c2: "+c2.getSaldo());
    }
    
    
    


}
