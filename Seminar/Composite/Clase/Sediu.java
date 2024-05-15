package Composite.Clase;

public abstract class Sediu {
    private String locatie;

    public String getLocatie() {
        return locatie;
    }

    public Sediu(String locatie) {
        this.locatie = locatie;
    }

    public abstract void adaugaComponenta(Sediu sediu) throws Exception;
    public abstract void afiseazaDetalii();
}
