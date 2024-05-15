package Observer.Main;

import Observer.ClaseObserver.Calator;
import Observer.ClaseSubiect.Autobuz;

public class Main {
    public static void main(String[] args) {
        Calator c = new Calator();
        Calator c1 = new Calator();

        Autobuz a = new Autobuz();

        a.AdaugaCalator(c);
        a.AdaugaCalator(c1);

        a.trimiteMesaj("A intervenit ceva");
    }
}
