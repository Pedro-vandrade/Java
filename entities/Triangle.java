package entities;

public class Triangle {
    public double a;
    public double b;
    public double c;

    // criando func que calcula area, entre parenteses
    // dem estar os parametros, no caso estão instanciados nas linhas acima
    public double area () {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p-a) * (p-b) *(p-c));
    }
}
