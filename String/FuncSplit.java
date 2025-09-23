package String;

import java.lang.String;

public class FuncSplit {
    public static void main(String[] args) {
        String s = "cat,dog,duck";

        String[] vect = s.split(",");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);

    }
}
