package Proxy.Clase;

public class ProxyAutobuz implements Automobil{
    private AutobuzNoapte autobuzNoapte;

    public ProxyAutobuz(AutobuzNoapte autobuzNoapte) {
        this.autobuzNoapte = autobuzNoapte;
    }


    @Override
    public void opreste() {
        if(autobuzNoapte.getNrCalatori() > 0) {
            autobuzNoapte.opreste();
        } else {
            System.out.println("Autobuzul nu a oprit in statie");
        }

    }
}
