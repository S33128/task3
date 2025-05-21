import java.util.ArrayList;
import java.util.List;
public class Student {
    public String imie;
    public String nazwisko;
    public List<Double> oceny;
    public Student(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = new ArrayList<>();
    }
    public void dodajOcene(double ocena) {
        if (oceny.size() >= 20) {
            throw new IllegalStateException("Student nie może mieć więcej niż 20 ocen.");
        }
        oceny.add(ocena);
    }
    public double obliczSredniaZaokraglona() {
        if (oceny.isEmpty()) {
            throw new IllegalArgumentException("Student nie ma żadnych ocen.");
        }
        double suma = 0;
        for (double ocena : oceny) {
            suma += ocena;
        }
        double srednia = suma / oceny.size();
        double[] dozwolone = {2.0, 2.5, 3.0, 3.5, 4.0, 4.5, 5.0};
        double najblizsza = dozwolone[0];
        for (double wartosc : dozwolone) {
            if (Math.abs(wartosc - srednia) < Math.abs(najblizsza - srednia)) {
                najblizsza = wartosc;
            }
        }
        return najblizsza;
    }
}
