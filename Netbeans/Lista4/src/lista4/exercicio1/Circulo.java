/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio1;

import static java.lang.Math.pow;

/**
 *
 * @author Pedro
 */
public class Circulo extends FormaGeometrica{

    private double raio;
    private double pi = 3.14159265359;
    
    public Circulo (double raio){
        this.raio = raio;
    }
    
    @Override
    double area() {
        return( pi * pow(raio,2));
    }

    @Override
    double perimetro() {
        return ( 2 * pi * raio);
    }
    
}
