package factoryMethod.fabrici;

import factoryMethod.clase.Medicament;

public abstract class FabricaMedicamente {
    private String denumire;
    private float pret;
    public abstract Medicament creareMedicament();

    public FabricaMedicamente(String denumire, float pret) {
        this.denumire = denumire;
        this.pret = pret;
    }

    public String getDenumire() {
        return denumire;
    }

    public float getPret() {
        return pret;
    }
}
