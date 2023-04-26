public class NonLiving extends Component
{
    private double OPTIMUM_CARBON_CONTENT;
    private double LOWER_OPTIMUM_TEMPERATURE;
    private double UPPER_OPTIMUM_TEMPERATURE;

    enum Types {SINK, SOURCE, BOTH}
    protected Types type;
    protected double carbonContent;
    protected double currentTemperature;
    protected static Environment environment;
    protected String name;
    

    public NonLiving(String name, String type, double carbonContent, double currentTemperature)
    {
        super(name, type);
        this.carbonContent = carbonContent;
        this.currentTemperature = currentTemperature;

        // Set optimum temperature and carbon content based on the name of nonLiving component
    }

    public void setCarbonContent(double carbonContent)
    {
        this.carbonContent = carbonContent;
    
    }

    public double getCarbonContent()
    {
        return carbonContent;
    }

    public void setCurrentTemperature(double currentTemperature)
    {
        this.currentTemperature = currentTemperature;
    
    }

    public double getCurrentTemperature()
    {
        return currentTemperature;
    }

    public toString(){

    }
}
