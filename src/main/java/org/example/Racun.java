package org.example;

public class Racun {
    private long brojRacuna;
    private Osoba korisnikRacuna;
    private boolean odobrenjePrekoracenja;
    private double stanjeRacuna;

    public Racun(long brojRacuna, Osoba korisnikRacuna) {
        this.brojRacuna = brojRacuna;
        this.korisnikRacuna = korisnikRacuna;
    }

    private boolean provjeriOdobrenjePrekoracenja(double broj){
        return odobrenjePrekoracenja;
    }

    boolean izvrsiUplatu(double uplata){
        stanjeRacuna=stanjeRacuna+uplata;
        return true;
    }

    boolean izvrsiIsplatu(double isplata){
        if(isplata<=stanjeRacuna || odobrenjePrekoracenja==true){
            stanjeRacuna=stanjeRacuna-isplata;
            return true;
        }
        return false;
    }

    void odobriPrekoracenje(double broj) {
        odobrenjePrekoracenja=true;
    }

}
