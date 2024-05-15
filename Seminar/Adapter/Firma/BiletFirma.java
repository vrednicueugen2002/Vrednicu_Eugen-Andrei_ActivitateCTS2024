package Adapter.Firma;

public class BiletFirma implements Bilet{
    @Override
    public void cumparaBilet() {
        System.out.println("Acest bilet a fost cumparat prin firma");
    }
}
