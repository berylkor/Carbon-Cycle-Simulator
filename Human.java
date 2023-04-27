public class Human extends Animal{
     /** 
    * This class models an animal 
    * @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
    */
    
    // constructor that sets the name, carbon compostion, expired carbon and egested carbon
    public Human(String name,  double carbonComposition, double expiredCarbon, double egestedCarbon){
        super(name, carbonComposition, expiredCarbon, egestedCarbon);
    }
    
    /**
    * This method takes an object of the living class
    * checks if Human object calling it is alive and prints out the thing the 
    * object is burning. It then adds to the carbon content of
    * atmosphere using the carbon compostion of whatever is being burnt
    * else it prints a statement to show the object is dead
    */
    public void burn(Living thing){
        if (this.isAlive){
            System.out.println(this.name + " is burning " + thing.getName());
            environment.atmosphere.increaseCarbonContent(thing.carbonComposition);
        } else{
            System.out.println(this.name + " is dead and cannot burn");
        }
    }
    
    /**
    * This method takes a method of the living class and
    * checks if the human class that is calling it is alive.
    * if it is alive then it prints the statement to show
    * that the object is recycling. If the object is dead it prints a
    * statement to show that
    */
    public void recycle(Living thing){
        if (this.isAlive){
            System.out.println(this.name + " recycles " + thing.getName());
        } else{
            System.out.println(this.name + " is dead and cannot recycle.");
        }
    }
}
