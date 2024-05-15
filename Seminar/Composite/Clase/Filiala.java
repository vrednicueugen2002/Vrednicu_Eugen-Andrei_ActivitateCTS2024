package Composite.Clase;

public class Filiala extends Sediu {

    public Filiala(String locatie) {
        super(locatie);
    }

    @Override
    public void adaugaComponenta(Sediu sediu) throws Exception {
        throw new Exception("Unsuported");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.printf("Sediu-locatia %s\t", super.getLocatie());
    }
}
