import java.util.Objects;

public class Student {

    private String jmeno;
    private int rocnik;
    private double prumer;

    public Student(String jmeno, int rocnik, double prumer) {
        this.jmeno = jmeno;
        this.rocnik = rocnik;
        this.prumer = prumer;
    }

    public String getJmeno() {
        return jmeno;
    }

    public int getRocnik() {
        return rocnik;
    }

    public double getPrumer() {
        return prumer;
    }

    public void setJmeno(String jmeno) {
        if (jmeno != null) {
            this.jmeno = jmeno;
        } else {
            System.out.println("jméno nesmí být prázdné");
        }

    }

    public void setRocnik(int rocnik) {
        if (rocnik >0 && rocnik < 5) {
            this.rocnik = rocnik;
        } else {
            System.out.println("Ročník musí být 1-4");
        }

    }

    public void setPrumer(double prumer) {
        if (prumer >= 1 && prumer <= 5) {
            this.prumer = prumer;
        }
        this.prumer = prumer;
    }

    @Override
    public String toString() {
        return jmeno +" (ročník: "+rocnik+", prumer: "+prumer+")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(getPrumer(), student.getPrumer()) == 0 && Objects.equals(getJmeno(), student.getJmeno());
    }

    public double zlepsiPrumer(double oKolik){
        if (prumer - oKolik >= 1 && prumer - oKolik <= 5){
            prumer -= oKolik;
            return prumer;
        }else {
            System.out.println("Průměr nejde zlepšit o "+oKolik);
            return prumer;
        }
    }

    public String klasifikace(){
        if (prumer <= 1.8){
            return "Výborný";
        } else if (prumer > 1.8 && prumer <= 2.6){
            return "Chvalitebný";
        } else if (prumer > 2.6 && prumer <= 3.4){
            return "Dobrý";
        } else if (prumer > 3.4 && prumer <= 4.2){
            return "Dostatečný";
        } else {
            return "Nedostatečný";
        }
    }



}
