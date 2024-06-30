public class LuxuryVehicle1 implements Vehicle{

    String name;
    int average;
    String typeofVehicle;
   LuxuryVehicle1(String name,String typeofVehicle){
        this.name=name;
        this.average=500;
        this.typeofVehicle=typeofVehicle;
    }
    public String getName(){
        return  this.name+" "+this.typeofVehicle;
    }
    public int getAverage(){
        return this.average;
    }

}
