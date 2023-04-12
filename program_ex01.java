package application;

import entities.Retangulo;

import java.util.Scanner;
// import entities.Retangulo;

public class program_ex01 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        Retangulo retangle = new Retangulo();
        System.out.println("Informe a largura e altura do retângulo: ");
        retangle.width = sc.nextDouble();
        retangle.height = sc.nextDouble();

        System.out.println("Area: " + retangle.area());
        System.out.println("Perimetro: " + retangle.Perimeter());
        System.out.println("Diagonal: " + retangle.Diagonal());


        sc.close();
    }
}
