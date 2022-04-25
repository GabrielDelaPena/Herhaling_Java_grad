package Oef_2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Snack snack_1 = new Snack(456123,"Frietjes",2.99);
        Snack snack_3 = new Snack(789456,"Ketchup",0.50);
        Snack snack_2 = new Snack(852147,"Frikandel",1.99);


        Snacks.voegSnackToe(snack_1);
        Snacks.voegSnackToe(snack_2);
        Snacks.voegSnackToe(snack_3);

        System.out.println(Snacks.getSnacks());

    }
}
