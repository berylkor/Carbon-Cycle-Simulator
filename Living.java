public abstract class Living extends Component{
    // instance variables
    protected boolean isAlive = true;
    protected boolean beenEaten = false;
    protected double carbonComposition;
    protected double expiredCarbon;

    // constructor that sets name, type, carbon composition and expired carbon
    public Living(String name, String type, double carbonComposition, double expiredCarbon){
        super(name, type);
        this.carbonComposition = carbonComposition;
        this.expiredCarbon = expiredCarbon;
    }
    
    // accessor method for getting carbon compostion
    public double getCarbonComposition(){
        return this.carbonComposition;
    }
    
    // mutator method for setting the carbon compostion
    public void setCarbonComposition(double carbonComposition){
        this.carbonComposition = carbonComposition;
    }
    
    // accessor method for getting expired carbon 
    public double getExpiredCarbon(){
        return this.expiredCarbon;
    }
    
    // mutator method for setting the expired carbon
    public void setExpiredCarbon(double expiredCarbon){
        this.expiredCarbon = expiredCarbon;
    }
    /**
    * This method checcks if an object is alive then
    * prints a message to show the object is respiring
    * it increases the carbon content within the atmosphere of the environment
    * by the object's expired carbon
    */
    public void respire(){
        if (this.isAlive){
            System.out.println(this.name + " is respiring.");
            environment.atmosphere.increaseCarbonContent(this.expiredCarbon);
        } else {
            System.out.println(this.name + " is dead and cannot respire.");
        }
    }
    /**
    * This method changes the value of the isAlive variable to false
    * and prints a method showing the object calling it is dead
    */
    public void die(){
        isAlive = false;
        System.out.println(this.name + " is dead.");
    }
}
