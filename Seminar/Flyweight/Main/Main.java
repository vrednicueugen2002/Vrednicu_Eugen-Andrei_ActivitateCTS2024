package Flyweight.Main;

import Flyweight.Clase.Banca;
import Flyweight.Clase.Cont;
import Flyweight.Clase.Detinator;


//10. Pentru fiecare cont trebuie să se rețină informații cu privire la deținătorul său: nume, adresa,
//    număr de telefon, adresă de mail, etc, precum și informațiile espre bancă: nume, sucursală, capital, etc.
//        Pe lângă aceste informații un cont deține și informații precum număr cont, sumă etc.
//        Astfel, dacă o persoană are mai multe conturi, la fiecare cont informațiile despre deținător
//        sunt aceleaşi şi se repetă, ocupând foarte multă memorie. Să se implementeze modulul
//        de memorare al conturilor astfel încât să nu se ocupe memorie foarte multă.

public class Main {
    public static void main(String[] args) {
        Banca banca = new Banca();
        Cont cont = new Cont("123123", 32f);
        Detinator detinator = new Detinator("Andrei", "12assd@asdasd/com", "07433232");

        banca.AdaugaClient(detinator);

        banca.afisareDetaliiClient(detinator.getNume()).afisareDetalii(cont);
    }
}
