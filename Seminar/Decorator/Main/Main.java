package Decorator.Main;

//7. Compania doreste ca modulul de printare al biletelor sa permita cu ocazia anumitor zile nationale
//        sa printeze pe bilet un mesaj de "La multi ani". Se doreste implementarea acestui modul care sa
//        adauge functionalitatea de printare mesaj customizat. Exista posibilitatea ca aceasta functionalitate
//        sa nu fie folosita, si din acest motiv se doreste sa fie optionala, fara modificarea codului existent.

import Decorator.Clase.Bilet;
import Decorator.Clase.FacadeBilet;
import Decorator.Clase.Printabil;

public class Main {
    public static void main(String[] args) {
        Bilet bilet = new Bilet();
        bilet.printeaza();

        Printabil facadeBilet = new FacadeBilet(bilet);
        facadeBilet.printeaza();
    }
}
