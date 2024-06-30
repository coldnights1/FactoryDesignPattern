public class LuxuryFactory implements Factory1{

    public Vehicle getVehicle(String name,String typeOfVehicle){
        if(typeOfVehicle!="LUXURY") return null;
        if(name=="POOR"){
            return new LuxuryVehicle1(name,typeOfVehicle);
        }
        return new LuxuryVehicle2(name,typeOfVehicle);
    }
}
