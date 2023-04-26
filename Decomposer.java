public class Decomposer extends Living{
    
    public Decomposer(String name,  double carbonComposition, double expiredCarbon){
        super(name, "both", carbonComposition, expiredCarbon);
        environment.addDecomposer(this);
    }

    public void decompose(Living thing){
        if (this.isAlive && thing.beenEaten){
        System.out.println(this.name + "decomposes" + thing.getName());
        }
    }

    public void die(){
        super.die();
        environment.removeDecomposer(this);
    }
}