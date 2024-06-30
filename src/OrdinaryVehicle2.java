public class OrdinaryVehicle2 implements Vehicle{

    String name,typeOfVehicle;
    int average;
    OrdinaryVehicle2(String name,String typeOfVehicle){
        this.name=name;
        this.typeOfVehicle=typeOfVehicle;
        this.average=200;
    }
    public String getName(){
        return  this.name+" "+this.typeOfVehicle;
    }
    public int getAverage(){
        return this.average;
    }

}
