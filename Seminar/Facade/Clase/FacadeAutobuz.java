package Facade.Clase;

public class FacadeAutobuz {
    private Autobuz autobuz;

    public FacadeAutobuz(Autobuz autobuz) {
        this.autobuz = autobuz;
    }

    public void deschideUsile()
    {
        this.autobuz.deschideUsaFata();
        this.autobuz.deschideUsaMijloc();
        this.autobuz.deschideUsaSpate();
    }

    public void inchideUsile()
    {
        this.autobuz.inchideUsaSpate();
        this.autobuz.inchideUsaFata();
        this.autobuz.inchideUsaMijloc();
    }
}
