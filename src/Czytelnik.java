/**
 <Opis klasy>Klasa dziedziczy klase Osoba, posiada pole/liste przeczytaneKsiazki,
        metode wypiszKsiazki oraz toString z klasy Osoba który wypisze także listę książek
        przez danego czytelnika przeczytanych </Opis>
 <przeczytaneKsiazki> : <String>, <Pole zawiera liste przeczytanych książek>
 @author : <Mark><Pohrebnyak>
 **/
import java.util.ArrayList;
import java.util.List;

public class Czytelnik extends Osoba{
    private List<Ksiazka> przeczytaneKsiazki;

    public Czytelnik(String imie, String nazwisko, int wiek) {
        super(imie, nazwisko, wiek);
        this.przeczytaneKsiazki = new ArrayList<>();
    }
    public void przeczytajKsiazke(Ksiazka ksiazka){
        this.przeczytaneKsiazki.add(ksiazka);
    }

    public String WypiszKsiazki(){
        StringBuilder sb = new StringBuilder();
        sb.append(getImie()).append("").append(getNazwisko()).append("przeczytał: ");
        for (int i = 0; i < przeczytaneKsiazki.size(); i++){
            sb.append(przeczytaneKsiazki.get(i).getTytul());
            if (i < przeczytaneKsiazki.size() - 1){
                sb.append(", ");
            }
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("Przeczytał książki:\n");
        for (Ksiazka ksiazka: this.przeczytaneKsiazki){
            sb.append(ksiazka.toString());
            sb.append("\n");
        }
        return sb.toString();
    }
}

