public class Animal extends Living{
    double egestedCarbon;

    public Animal(String name,  double carbonComposition, double expiredCarbon, double egestedCarbon){
        super(name, "both", carbonComposition, expiredCarbon);
        this.egestedCarbon = egestedCarbon;
        environment.addAnimal(this);
    }

    public double getEgestedCarbon(){
        return this.egestedCarbon;
    }

    public void setEgestedCarbon(double egestedCarbon){
        this.egestedCarbon = egestedCarbon;
    }

    public void feed(Living prey){
        if (this.isAlive && prey.isAlive){

            System.out.println(this.name + "  is feeding on " + prey.getName());
            this.carbonComposition += prey.getCarbonComposition();
        
        } else if (!this.isAlive){

            System.out.println(prey.getName() + " is already dead and cannot be fed upon");

        } else {

            System.out.print(this.name + " is dead and cannot feed.");
        
        }
        
    }

    public void egest(){
        System.out.println(this.name + " is egested.");
        environment.soil.increaseCarbonContent(this.egestedCarbon);
        this.carbonComposition -= this.egestedCarbon;
    }

    public void die(){
        super.die();
        environment.removeAnimal(this);
    }
}
