/* This class models a plant */
public class Plant extends Living{
    final double carbonAbsorbed;// amount of carbon absorbed each time the plant photosynthesizes

    //a constructor that takes a name, carbonComposition, expiredCarbon and carbonAbsorbed
    public Plant(String name,  double carbonComposition, double expiredCarbon, double carbonAbsorbed){
        super(name, "both", carbonComposition, expiredCarbon);
        this.carbonAbsorbed = carbonAbsorbed;
        environment.addPlant(this);// calls the addPlant method of environment
    }

    /**This method gets the carbonAbsorbed
     * 
     * @return carbonAbsorbed
     */
    public double getCarbonAbsorbed() {
        return carbonAbsorbed;
    }
    
    /**This method allows the plant to photosynthesize
     * It check if the plant is alive 
     * If it is, it calls the decreaseCarbonContent() method of the Atmosphere class
     * and prints the notification message
     * Otherwise, it prints an appropriate notification message
     */
    public void photosynthesize(){
        if (this.isAlive){
        System.out.println(this.name + " is photosynthesizing.");
        environment.atmosphere.decreaseCarbonContent(this.carbonAbsorbed);
        }else{
            System.out.print(this.name + " is dead and cannot photosynthesize.");
        }
    }

    /* The plant dies
     * 
     */
    public void die(){
        super.die();
        environment.removePlant(this);// calls the removePlant() method of the Environment class
    }
}

