package Decorator.Clase;

public class FacadeBilet implements Printabil{
    private Bilet bilet;

    public FacadeBilet(Bilet bilet) {
        this.bilet = bilet;
    }

    @Override
    public void printeaza() {
        bilet.printeaza();
        System.out.println("La multi ani!");
    }
}
