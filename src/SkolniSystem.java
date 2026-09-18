import java.util.ArrayList;

public class SkolniSystem {

    ArrayList<Student> studenti = new ArrayList<>();

    public void addStudent(Student student) {
        studenti.add(student);
    }

    public void vypis() {
        for (Student student : studenti) {
            System.out.println(student);
        }
    }

    public Student najdiStudenta(String jmeno) {
        int i = 0;
        Student najdiStudent = null;
        for (Student student : studenti) {
            if (student.getJmeno().equals(jmeno)) {
                i++;
                najdiStudent = student;
            }
        }
        if (i == 0) {
            return null;
        } else  {
            return najdiStudent;
        }

    }
}
