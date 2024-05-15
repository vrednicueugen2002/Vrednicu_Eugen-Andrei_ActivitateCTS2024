package Adapter.Platforma;

import Adapter.Firma.Bilet;

public class AdapterEBilet implements EBilet{
    private Bilet biletFirma;

    public AdapterEBilet(Bilet biletFirma) {
        this.biletFirma = biletFirma;
    }

    @Override
    public void cumparaBiletOnline() {
        biletFirma.cumparaBilet();
    }
}
