package State.Clase;

public class Achizitionata implements Stare{

    @Override
    public void schimbaStare(Reteta farmacie) {
        farmacie.setStare(this);
    }
}
