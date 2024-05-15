package State.Clase;

public class Reteta {
    private Stare stare;

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public Reteta() {
        this.stare = new Emisa();
    }

    public void AchizitionareRetenta() {
        if(this.stare instanceof Emisa) {
            System.out.println("Ati achizitionat reteta!");
            Achizitionata achizitionata = new Achizitionata();
            achizitionata.schimbaStare(this);
        } else {
            System.out.println("Reteta nu a fost emisa pt a fi achizitionata!");
        }
    }
}
