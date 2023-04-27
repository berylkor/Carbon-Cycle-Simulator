/** 
* A class that models an animal and inherits from the Living class 
* @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
*/
public class Animal extends Living{
    double egestedCarbon;// the amount of carbon released into the soil during egestion.

    //constructor that takes a name, carbonCompositon, expiredCarbon and egestedCarbon
    public Animal(String name,  double carbonComposition, double expiredCarbon, double egestedCarbon){

        super(name, "both", carbonComposition, expiredCarbon);
        this.egestedCarbon = egestedCarbon;
        environment.addAnimal(this);// calls addAnimal() method from the Environment class
    }
    
    /**
     * This method gets the egestedCarbon
     * @return {@code egested Carbon}
     */
    public double getEgestedCarbon(){
        return this.egestedCarbon;
    }
    

    /**
     * Allows the animal to feed on another living 
     * The method first checks if both prey and predator are alive
     * If it increases the predator's carbonComposition by that of the prey
     * It then calls the die method for the prey
     * 
     * If the conditions are not met, it prints out the appropriate notification messages
     * @param prey
     */
    public void feed(Living prey){
        if (this.isAlive && prey.isAlive){

            System.out.println(this.name + "  is feeding on " + prey.getName());
            this.carbonComposition += prey.getCarbonComposition();
            prey.die();

        } else if (!this.isAlive){

            System.out.println(prey.getName() + " is already dead and cannot be fed upon");

        } else {

            System.out.print(this.name + " is dead and cannot feed.");
        
        }
        
    }

    /**
     * This messages allows the animal to egest
     * It increases the soil's carbon content by the amount of carbon egested
     * It then decrements the animal's carbonCOmposition by the egestedCarbon
     */
    public void egest(){
        System.out.println(this.name + " is egested.");
        environment.soil.increaseCarbonContent(this.egestedCarbon);
        this.carbonComposition -= this.egestedCarbon;
    }

    public void die(){
        super.die();
        environment.removeAnimal(this);// calls the removeAnimal method from the environment class
    }
}
