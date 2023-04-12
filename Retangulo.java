package entities;

public class Retangulo {
    public double width;
   public double height;

    public double area(){
        return width * height;
    }
    public double Perimeter(){
        return 2 * (width + height);
    }
    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
