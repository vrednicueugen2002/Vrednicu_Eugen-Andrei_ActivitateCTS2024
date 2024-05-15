package Template.Clase;

public abstract class AchizitieAbstracta {
    abstract void primireReteta();
    abstract boolean verificaStoc();
    abstract void aduMedicamente();
    abstract void incaseazaBanii();
    abstract void emiteBonul();

    public final void cumparaMedicament()
    {
        primireReteta();
        if(verificaStoc()) {
            aduMedicamente();
            incaseazaBanii();
            emiteBonul();
        } else {
            System.out.println("Stoc insuficient");
        }
    }
}
