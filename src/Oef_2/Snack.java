package Oef_2;

import java.util.Comparator;

public class Snack implements Comparator<String> {
    private int artikelcode;
    private String naam;
    private double prijs;

    public Snack(int artikelcode, String naam, double prijs) {
        this.artikelcode = artikelcode;
        this.naam = naam;
        this.prijs = prijs;
    }

    public int getArtikelcode() {
        return artikelcode;
    }

    public void setArtikelcode(int artikelcode) {
        this.artikelcode = artikelcode;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        this.prijs = prijs;
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1 == o2) {
            return 0;
        }
        if (o1 == null) {
            return -1;
        }
        if (o2 == null) {
            return 1;
        }
        return o1.compareTo(o2);
    }

    @Override
    public String toString() {
        return "Snack{" +
                "artikelcode=" + artikelcode +
                ", naam='" + naam + '\'' +
                ", prijs=" + prijs +
                '}';
    }
}
