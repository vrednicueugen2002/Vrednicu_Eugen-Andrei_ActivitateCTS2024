package Proxy.Main;


//8. Pentru autobuzele de noapte se doreste ca oprirea in statie sa se faca doar daca exista persoane
//        in autobuz. In caz contrar autobuzul se retrage la autobaza fara sa mai realizeze opriri. Sa se
//        implementeze modul care va permite oprirea in statie a autobuzelor doar daca exista calatori in
//        autobuz.


import Proxy.Clase.AutobuzNoapte;
import Proxy.Clase.ProxyAutobuz;

public class Main {
    public static void main(String[] args) {
        AutobuzNoapte autobuz = new AutobuzNoapte(0);
        autobuz.opreste();
        ProxyAutobuz proxyAutobuz = new ProxyAutobuz(autobuz);
        proxyAutobuz.opreste();
    }
}
