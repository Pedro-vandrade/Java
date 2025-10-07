package application;

import java.util.Locale;
import java.util.Scanner;

public class forEach {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[]{"Pedro", "Rue", "Vica"};

        for (String item : vect) {
            System.out.println(item + " ! ");
        }
    }
}
