// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
    FactoryofFactory factoryofFactory=new FactoryofFactory();
    OrdinaryFactory ordinaryFactory=(OrdinaryFactory) factoryofFactory.getFactory("ORDINARY");
    LuxuryFactory luxuryFactory=(LuxuryFactory) factoryofFactory.getFactory("LUXURY");
    OrdinaryVehicle1 vehicle1=(OrdinaryVehicle1) ordinaryFactory.getVehicle("POOR","ORDINARY");
    LuxuryVehicle2 vehicle2=(LuxuryVehicle2) luxuryFactory.getVehicle("NOT POOR","LUXURY");
    System.out.println(vehicle1.name);
    System.out.println(vehicle2.name);
}
}