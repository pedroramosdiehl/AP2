/*
 * Pedro Ramos Krauze Diehl
 * Engenharia de Computação
 * UFG
 */
package lista4.exercicio1;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 *
 * @author Pedro
 */
public class Triangulo  extends FormaGeometrica{

    double base , altura;
    
    public Triangulo (double base , double altura){
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    double area() {
        return ( (base * altura) / 2);
    }

    @Override
    double perimetro() {
        return ( 2  * (sqrt ( pow(altura,2) + (pow(base,2) / 4) + base) ) );
    }
    
}
