package leerkracht;

import java.util.TreeSet;

public final class SnackSingleton {

    //singleton pattern
    private static final SnackSingleton INSTANCE = new SnackSingleton();

    private SnackSingleton() {

    }

    public static SnackSingleton getINSTANCE() {
        return INSTANCE;
    }


    // snack beheer
    private TreeSet<Snack> snackSet = new TreeSet<>();

    public void addSnack(Snack s) {
        snackSet.add(s);
    }

    public void removeSnack(Snack s) {
        snackSet.remove(s);
    }

    public TreeSet<Snack> getSnackSet() {
        return snackSet;
    }
}
