package Observer.ClaseSubiect;

import Observer.ClaseObserver.Calator;

import java.util.ArrayList;
import java.util.List;

public class Autobuz implements Subiect{
    private List<Calator> calatori;

    public Autobuz() {
        this.calatori = new ArrayList<>();
    }

    public void AdaugaCalator(Calator c) {
        calatori.add(c);
    }
    @Override
    public void trimiteMesaj(String mesaj) {
        calatori.forEach(calator -> calator.primesteMesaj(mesaj));
    }
}
