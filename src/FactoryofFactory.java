public class FactoryofFactory {
    public Factory1 getFactory(String typeOfFactory){
         if(typeOfFactory=="LUXURY"){
            return new LuxuryFactory();
         }
         else if(typeOfFactory=="ORDINARY"){
              return new OrdinaryFactory();
         }
         else{
             return null;
         }
    }
}
