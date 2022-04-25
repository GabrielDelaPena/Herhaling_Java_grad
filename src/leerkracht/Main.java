package leerkracht;

public class Main {
    public static void main(String[] args) {

        Snack s1 = new Snack(123,"coca",1.2f);
        Snack s2 = new Snack(123,"fanta",1.2f);


        SnackSingleton.getINSTANCE().addSnack(s1);
        SnackSingleton.getINSTANCE().addSnack(s2);
        System.out.println(SnackSingleton.getINSTANCE().getSnackSet());

    }
}
