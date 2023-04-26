public abstract class Living extends Component{
    protected boolean isAlive = true;
    protected boolean beenEaten = false;
    protected double carbonComposition;
    protected double expiredCarbon;


    public Living(String name, String type, double carbonComposition, double expiredCarbon){
        super(name, type);
        this.carbonComposition = carbonComposition;
        this.expiredCarbon = expiredCarbon;
    }


    public double getCarbonComposition(){
        return this.carbonComposition;
    }

    public void setCarbonComposition(double carbonComposition){
        this.carbonComposition = carbonComposition;
    }

    public double getExpiredCarbon(){
        return this.expiredCarbon;
    }

    public void setExpiredCarbon(double expiredCarbon){
        this.expiredCarbon = expiredCarbon;
    }

    public void respire(){
        if (this.isAlive){
            System.out.println(this.name + " is respiring.");
            environment.atmosphere.increaseCarbonContent(this.expiredCarbon);
        } else {
            System.out.println(this.name + " is dead and cannot respire.");
        }
    }

    public void die(){
        isAlive = false;
        System.out.println(this.name + " is dead.");
    }
}
