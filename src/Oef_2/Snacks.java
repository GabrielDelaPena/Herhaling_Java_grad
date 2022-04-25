package Oef_2;

import java.util.ArrayList;

public class Snacks {
    public static ArrayList<Snack> snacks = new ArrayList<>();

    public static ArrayList<Snack> getSnacks() {
        return snacks;
    }

    public static void voegSnackToe(Snack s) {
        Snacks.snacks.add(s);
    }

    public static void verwijderSnack(Snack s) {
        Snacks.snacks.remove(s);
    }

}
