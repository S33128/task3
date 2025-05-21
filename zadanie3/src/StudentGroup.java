import java.util.ArrayList;
import java.util.List;
public class StudentGroup {
    public String nazwaGrupy;
    public List<Student> studenci;
    public StudentGroup(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
        this.studenci = new ArrayList<>();
    }
    public void dodajStudenta(Student student) {
        if (studenci.contains(student)) {
            throw new IllegalStateException("Ten student już znajduje się w grupie.");
        }
        if (studenci.size() >= 15) {
            throw new IllegalStateException("Grupa nie może zawierać więcej niż 15 studentów.");
        }
        studenci.add(student);
    }
}
