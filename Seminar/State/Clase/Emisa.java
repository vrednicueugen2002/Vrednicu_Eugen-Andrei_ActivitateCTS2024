package State.Clase;

public class Emisa implements Stare{
    @Override
    public void schimbaStare(Reteta reteta) {
        reteta.setStare(this);
    }
}
