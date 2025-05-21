public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Anna", "Kowalska");
        Student student2 = new Student("Jan", "Nowak");
        student1.dodajOcene(3.0);
        student1.dodajOcene(4.0);
        student1.dodajOcene(3.5);
        student2.dodajOcene(5.0);
        student2.dodajOcene(4.5);
        student2.dodajOcene(5.0);
        System.out.println("Średnia Anny: " + student1.obliczSredniaZaokraglona());
        System.out.println("Średnia Jana: " + student2.obliczSredniaZaokraglona());
        StudentGroup grupa = new StudentGroup("Grupa A");
        grupa.dodajStudenta(student1);
        grupa.dodajStudenta(student2);
        System.out.println("Studenci w " + grupa.nazwaGrupy + ":");
        for (Student s : grupa.studenci) {
            System.out.println("- " + s.imie + " " + s.nazwisko);
        }
    }
}
