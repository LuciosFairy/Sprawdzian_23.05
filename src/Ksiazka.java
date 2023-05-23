/**
 <Opis klasy>Klasa zawiera prywatne pola : tytul, autor, data_wydania; Klasa Ksiazka zawiera rownież, metode toString</Opis>
 <tytul> : <String>, <Pole zawiera tytuły Książek>
 <autor> : <String>, <Pole zawiera autorów Książek>
 <data_wydania> : <int>, <Pole zawiera daty wydaą Książek>
 @author : <Mark><Pohrebnyak>
 **/

public class Ksiazka {
    private String tytul;
    private Osoba autor;
    private int data_wydania;

    public String getTytul() {
        return tytul;
    }

    public void setTytul(String tytul) {
        this.tytul = tytul;
    }

    public Osoba getAutor() {
        return autor;
    }

    public void setAutor(Osoba autor) {
        this.autor = autor;
    }

    public int getData_wydania() {
        return data_wydania;
    }

    public void setData_wydania(int data_wydania) {
        this.data_wydania = data_wydania;
    }

    @Override
    public String toString() {
        return "Ksiazka{" +
                "tytul='" + tytul + '\'' +
                ", autor=" + autor +
                ", data_wydania='" + data_wydania + '\'' +
                '}';
    }
}
