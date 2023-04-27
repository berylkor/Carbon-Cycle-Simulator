public class Decomposer extends Living{
    /** 
    * This class models a decomposer and inherits from the living class 
    * @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
    */
    
    //constructor that takes a name, carbonComposition and expiredCarbon
    public Decomposer(String name,  double carbonComposition, double expiredCarbon){
        super(name, "both", carbonComposition, expiredCarbon);
        environment.addDecomposer(this);//calls the addDecomposer() method from the Environment class
    }

    /**
      * This method decomposes another living thing
      * It checks whether the thing is alive and has not been eaten
      * It then calls the increaseCarbonContent() method from the Environment class
     */
    public void decompose(Living thing){
        if (this.isAlive && !thing.beenEaten){
        System.out.println(this.name + " decomposes " + thing.getName());
        environment.soil.increaseCarbonContent(thing.getCarbonComposition());
        }
    }
    
    /**
      * This method uses the parent class die method
      * It then removes the decomposer from the environment
     */
    public void die(){
        super.die();
        environment.removeDecomposer(this);
    }
}
