package Strategy.Clase;

public class Validator {
    private Platitor plata;

    public Validator(Platitor plata) {
        this.plata = plata;
    }

    public void valideazaCalatorie()
    {
        this.plata.plateste();
    }
}
