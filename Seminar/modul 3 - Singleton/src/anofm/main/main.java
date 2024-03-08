package anofm.main;

import anofm.Manager;
import anofm.ManagerRegistry;

public class main {
    public static void main(String[] args) {
        ManagerRegistry registry = ManagerRegistry.getInstance();
        registry.inregistreazaManager("CTS SRL", "Popescu", 10000f);
        registry.inregistreazaManager("CTS SRL", "Alin", 20000f);

        System.out.println(registry.getManager("CTS SRL"));

    }
}
