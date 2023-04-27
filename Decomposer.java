public class Decomposer extends Living{
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

    public void die(){
        super.die();
        environment.removeDecomposer(this);
    }
}
