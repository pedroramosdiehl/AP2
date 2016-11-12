/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio1;

/**
 *
 * @author Pedro
 */
public class Quadrilatero extends FormaGeometrica{

    private double l1,l2;

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }
    
    
    @Override
    double area() {
        return (l1 * l2);
    }
    
    public Quadrilatero (double lado1, double lado2){
        l1 = lado1;
        l2 = lado2;
    }

    @Override
    double perimetro() {
        return (2 * (l1 + l2));
    }


    
    
}
