package Template.Clase;

public class AchizitieMedicament extends AchizitieAbstracta{
    @Override
    void primireReteta() {
        System.out.println("Am primit reteta");
    }

    @Override
    boolean verificaStoc() {
        return true;
    }

    @Override
    void aduMedicamente() {
        System.out.println("Am adus medicamente");
    }

    @Override
    void incaseazaBanii() {
        System.out.println("Incasare bani");
    }

    @Override
    void emiteBonul() {
        System.out.println("Emite bonul");
    }
}
