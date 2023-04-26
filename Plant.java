public class Plant extends Living{
    final double carbonAbsorbed;

    public Plant(String name,  double carbonComposition, double expiredCarbon, double carbonAbsorbed){
        super(name, "both", carbonComposition, expiredCarbon);
        this.carbonAbsorbed = carbonAbsorbed;
        environment.addPlant(this);
    }

    public double getCarbonAbsorbed() {
        return carbonAbsorbed;
    }
    
    public void photosynthesize(){
        if (this.isAlive){
        System.out.println(this.name + " is photosynthesizing.");
        environment.atmosphere.decreaseCarbonContent(this.carbonAbsorbed);
        }else{
            System.out.print(this.name + " is dead and cannot photosynthesize.");
        }
    }

    public void die(){
        super.die();
        environment.removePlant(this);
    }
}

