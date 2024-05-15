package Adapter.Platforma;

public class BiletPlatforma implements EBilet{

    @Override
    public void cumparaBiletOnline() {
        System.out.println("Acest bilet a fost cumparat online");
    }
}
