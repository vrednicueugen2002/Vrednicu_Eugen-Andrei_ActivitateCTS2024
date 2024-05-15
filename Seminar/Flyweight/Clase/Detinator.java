package Flyweight.Clase;

public class Detinator implements FlyweightDetinator {
    private String nume;
    private String adresaEmail;
    private String telefon;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Detinator(String nume, String adresaEmail, String telefon) {
        this.nume = nume;
        this.adresaEmail = adresaEmail;
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Detinator{");
        sb.append("nume='").append(nume).append('\'');
        sb.append(", adresaEmail='").append(adresaEmail).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void afisareDetalii(Cont cont) {
        System.out.println(this.toString());
        System.out.println(cont.toString());
    }
}
