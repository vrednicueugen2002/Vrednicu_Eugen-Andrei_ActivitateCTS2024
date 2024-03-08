package companie;

public class Manager {
    private String nume;
    private double salariu;
    private int nrSubordonati;

    private static Manager instanta = null;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getSalariu() {
        return salariu;
    }

    public void setSalariu(double salariu) {
        this.salariu = salariu;
    }

    public int getNrSubordonati() {
        return nrSubordonati;
    }

    public void setNrSubordonati(int nrSubordonati) {
        this.nrSubordonati = nrSubordonati;
    }

    private Manager(String nume, double salariu, int nrSubordonati) {
        this.nume = nume;
        this.salariu = salariu;
        this.nrSubordonati = nrSubordonati;
    }

    public synchronized static Manager getInstance(String name, double salariu, int nrSub) {
        if(instanta == null) {
            instanta = new Manager(name,salariu,nrSub);
        }
        return instanta;
    }
    public static Manager getInstance() {
        return getInstance("nume", 23232, 23);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "nume='" + nume + '\'' +
                ", salariu=" + salariu +
                ", nrSubordonati=" + nrSubordonati +
                '}';
    }
}
