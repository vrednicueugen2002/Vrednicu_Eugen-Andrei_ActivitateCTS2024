package Proxy.Clase;

public class AutobuzNoapte implements Automobil{
    int nrCalatori;

    public int getNrCalatori() {
        return nrCalatori;
    }

    public AutobuzNoapte(int nrCalatori) {
        this.nrCalatori = nrCalatori;
    }

    @Override
    public void opreste() {
        System.out.println("Autobuzul a oprit in statie");
    }
}
