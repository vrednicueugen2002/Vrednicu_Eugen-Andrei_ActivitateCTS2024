package Composite.Clase;

import java.util.ArrayList;
import java.util.List;

public class Agentie extends Sediu{
    private List<Sediu> filiale;
    public Agentie(String locatie) {
        super(locatie);
        filiale = new ArrayList<>();
    }

    @Override
    public void adaugaComponenta(Sediu sediu) throws Exception {
        filiale.add(sediu);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.printf("Agentia-Locatie %s\n", super.getLocatie());
        filiale.forEach(filiala -> filiala.afiseazaDetalii());
    }
}
