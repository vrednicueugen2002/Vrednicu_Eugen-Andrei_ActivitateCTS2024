package Composite.Main;

//9. Să se implementeze structura ierarhică a agențiilor băncii știindu-se faptul că o sucursală deține
//        mai multe agenții, iar o agenție deține mai multe filiale.

import Composite.Clase.Agentie;
import Composite.Clase.Filiala;
import Composite.Clase.Sediu;

public class Main {
    public static void main(String[] args) throws Exception {
        Sediu sediu = new Filiala("Constanta");
        sediu.afiseazaDetalii();
        Sediu sediu2 = new Filiala("Megdigia");
        sediu2.afiseazaDetalii();

        Sediu agentie = new Agentie("Dobrogea");
        agentie.adaugaComponenta(sediu);
        agentie.adaugaComponenta(sediu2);
        System.out.println("---");
        agentie.afiseazaDetalii();
    }
}
