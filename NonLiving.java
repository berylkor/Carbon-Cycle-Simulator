 /** 
  * This models a non_living component of the environment 
  * @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
  */
public class NonLiving extends Component
{
    private double OPTIMUM_CARBON_CONTENT;
    private double LOWER_OPTIMUM_TEMPERATURE;
    private double UPPER_OPTIMUM_TEMPERATURE;

    /**
     * This enumeration species the allowed values for type
     * A sink is a component that absorbs carbon into the atmosphere
     * A sink is a component that releases carbon into the atmosphere
     * A source is a component that  carbon instead.
     */
    enum Types {SINK, SOURCE, BOTH}
    protected Types type;
    protected double carbonContent;// the carbon content of the environment
    protected double currentTemperature;// the current temperature of the environment
    protected static Environment environment;// the environment in which the component is found
    
    
    // A constructor that takes the name, type, carbon content and current Temperature
    public NonLiving(String name, String type, double carbonContent, double currentTemperature)
    {
        super(name, type);
        this.carbonContent = carbonContent;
        this.currentTemperature = currentTemperature;

        /* 
         * switch statement sets the values of the optimum carbon content, 
         * lower optimum temperature and upper optimum temperature 
         * depending on the name of the non-living component
         */
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
    }

    //increments the carbon content of the non-living component
    public void increaseCarbonContent(double increase)
    {
        this.carbonContent += increase; 
    }

    //decrements the carbon content of this non-living component
    public void decreaseCarbonContent(double decrease)
    {
        this.carbonContent -= decrease; 
    }

    /**
     * gets the carbon content
     * @return carbonContent
     */
    public double getCarbonContent()
    {
        return carbonContent;
    }

    /**
     * gets the current temperature
     * 
     * @return currentTemperature
     */
    public double getCurrentTemperature()
    {
        return currentTemperature;
    }

    //returns a representation of the object, specifically, the temperature and crbon content
    public String toString(){
        return "Temperature in degrees Celsius: " + this.currentTemperature
        + "\nCarbon Content: " + this.carbonContent;
    }
    
    /**
     * checks whether the current temperature is withing the optimum range
     * 
     * @return {@code true} if it is, {@code false} otherwise
     */
    public boolean checkCurrentTemperature()
    {
        if (this.currentTemperature < LOWER_OPTIMUM_TEMPERATURE || this.currentTemperature > UPPER_OPTIMUM_TEMPERATURE)
        {
            return false;
        }
        return true;
    }
    
    /**
     * checks whether the carbonContent is within the optimum range
     * 
     * @return {@code true} if it is, {@code false} otherwise
     */ 
    public boolean checkCarbonContent()
    {
        if (this.carbonContent< OPTIMUM_CARBON_CONTENT|| this.carbonContent >OPTIMUM_CARBON_CONTENT)
        {
            return false;
        }
        return true;
    }
}
