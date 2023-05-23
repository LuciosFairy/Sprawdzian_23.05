/**
 <Opis klasy>Klasa zawiera prywatne pola : imie, nazwisko, wiek; Klasa Osoba zawiera rownież, konstruktor parametryczny,
                metode toString oraz metode equals i hashCode</Opis>
 <imie> : <String>, <Pole zawiera imiona Osób>
 <nazwisko> : <String>, <Pole zawiera nazwiska Osób>
 <wiek> : <int>, <Pole zawiera wiek Osób>
 @author : <Mark><Pohrebnyak>
 **/

import java.util.Objects;

public class Osoba {
    private String imie;
    private String nazwisko;
    private int wiek;

    public Osoba(String imie, String nazwisko, int wiek) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", Nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Osoba osoba)) return false;
        return Objects.equals(getImie(), osoba.getImie()) && Objects.equals(getNazwisko(), osoba.getNazwisko());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getImie(), getNazwisko());
    }
}
