public class Human extends Animal{

    public Human(String name,  double carbonComposition, double expiredCarbon, double egestedCarbon){
        super(name, carbonComposition, expiredCarbon, egestedCarbon);
    }

    public void burn(Living thing){
        if (this.isAlive){
            System.out.println(this.name + " is burning " + thing.getName());
            environment.atmosphere.increaseCarbonContent(thing.carbonComposition);
        } else{
            System.out.println(this.name + " is dead and cannot burn");
        }
    }

    public void recycle(Living thing){
        if (this.isAlive){
            System.out.println(this.name + " recycles " + thing.getName());
        } else{
            System.out.println(this.name + " is dead and cannot recycle.");
        }
    }
}
