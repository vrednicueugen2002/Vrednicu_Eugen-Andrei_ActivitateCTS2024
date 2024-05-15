package Observer.ClaseObserver;

public class Calator implements Observer{
    @Override
    public void primesteMesaj(String mesaj) {
        System.out.println(mesaj);
    }
}
