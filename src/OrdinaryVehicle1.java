public class OrdinaryVehicle1 implements Vehicle{
    String name,typeOfVehicle;
    int average;
    OrdinaryVehicle1(String name,String typeOfVehicle){
        this.name=name;
        this.typeOfVehicle=typeOfVehicle;
        this.average=100;
    }
    public String getName(){
        return  this.name+" "+this.typeOfVehicle;
    }
    public int getAverage(){
        return this.average;
    }

}
