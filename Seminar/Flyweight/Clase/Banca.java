package Flyweight.Clase;

import java.util.HashMap;
import java.util.Map;

public class Banca {
    private Map<String, FlyweightDetinator> registruClienti;

    public Banca() {
        this.registruClienti = new HashMap<>();
    }

    public void AdaugaClient(Detinator detinator)
    {
        this.registruClienti.put(detinator.getNume(), detinator);
    }

    public FlyweightDetinator afisareDetaliiClient(String nume)
    {
       return this.registruClienti.get(nume);
    }
}
