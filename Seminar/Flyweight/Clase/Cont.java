package Flyweight.Clase;

public class Cont {
    private String numarCont;
    private float suma;

    public String getNumarCont() {
        return numarCont;
    }

    public float getSuma() {
        return suma;
    }

    public Cont(String numarCont, float suma) {
        this.numarCont = numarCont;
        this.suma = suma;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cont{");
        sb.append("numarCont='").append(numarCont).append('\'');
        sb.append(", suma=").append(suma);
        sb.append('}');
        return sb.toString();
    }
}
