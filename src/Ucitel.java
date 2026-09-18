public class Ucitel extends Osoba implements IVypisovatelny{

    private String jmeno;
    private String predmet;

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getPredmet() {
        return predmet;
    }

    public Ucitel(String jmeno, String predmet) {
        this.jmeno = jmeno;
        this.predmet = predmet;
    }

    public void popis(){

    }

    @Override
    public String radekVypisu() {
        return "";
    }
}
