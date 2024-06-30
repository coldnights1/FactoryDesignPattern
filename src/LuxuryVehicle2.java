public class LuxuryVehicle2 implements  Vehicle{


    String name,typeOfVehicle;
    int average;
    LuxuryVehicle2(String name,String typeOfVehicle){
        this.name=name;
        this.typeOfVehicle=typeOfVehicle;
        this.average=500;
    }
    public String getName(){
        return  this.name+" "+this.typeOfVehicle;
    }
    public int getAverage(){
        return this.average;
    }
}
