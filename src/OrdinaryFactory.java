public class OrdinaryFactory implements Factory1{
        public Vehicle getVehicle(String name,String typeOfVehicle){
            if(typeOfVehicle!="ORDINARY") return null;
            if(name=="POOR"){
                return new OrdinaryVehicle1(name,typeOfVehicle);
            }
             return new OrdinaryVehicle2(name,typeOfVehicle);
        }

}
