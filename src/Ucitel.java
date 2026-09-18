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
        System.out.println("Učitel: "+jmeno+", vyučuje: "+predmet);
    }

    @Override
    public String radekVypisu() {
        int mezery = 15 - jmeno.length();
        StringBuilder jmenoMezery = new StringBuilder(jmeno);
        for (int i = 0; i < mezery; i++) {
            jmenoMezery.append(" ");
        }
        return jmenoMezery+"| přemět: "+predmet;
    }
}
