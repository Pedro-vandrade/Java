package application;

package application;
import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class ProgramRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle height: ");
        rectangle.height = sc.nextDouble();
        System.out.println("Enter rectangle width: ");
        rectangle.width = sc.nextDouble();

        System.out.println("AREA = " + rectangle.area());


        sc.close();

    }
}

/*
* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. Usar uma classe como
mostrado no projeto ao lado.

*Enter rectangle width and height:
3.00
4.00
AREA = 12.00
PERIMETER = 14.00
DIAGONAL = 5.00
*
*
* */
