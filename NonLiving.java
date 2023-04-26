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

        switch (name){
            case "soil":
            OPTIMUM_CARBON_CONTENT = 500;
            LOWER_OPTIMUM_TEMPERATURE = 20;
            UPPER_OPTIMUM_TEMPERATURE = 30;
            break;

            case "ocean":
            OPTIMUM_CARBON_CONTENT = 1000;
            LOWER_OPTIMUM_TEMPERATURE = 5;
            UPPER_OPTIMUM_TEMPERATURE = 25;
            break;

            case "atmosphere":
            OPTIMUM_CARBON_CONTENT = 1000;
            LOWER_OPTIMUM_TEMPERATURE = -51;
            UPPER_OPTIMUM_TEMPERATURE = 17;
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
