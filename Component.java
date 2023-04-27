public abstract class Component{
    /** 
    * This class models a compenent that all classes inherit from
    * @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
    */
    
    /**
     * This enumeration specifies the allowed values for type
     * A sink is a component that absorbs carbon into the atmosphere
     * A sink is a component that releases carbon into the atmosphere
     * A source is a component that  carbon instead.
     */
    enum Types {SINK, SOURCE, BOTH}
    protected Types type;
    protected String name;// the name of the component
    protected static Environment environment = new Environment("forest");// the environment within which the component is found

    public Component(String componentName, String componentType){
        this.name = componentName;
        String typeLowerCase = componentType.toLowerCase();//converts the argument passed into lower case
        
        /**
         * The switch statement sets the type value depending on the 
         * argument passed as the componentType
         */
        switch (typeLowerCase) {
            case "sink":
            this.type = Types.SINK;
            break;
        
            case "source":
            this.type = Types.SOURCE;
            break; 
        
            case "both":
            this.type = Types.BOTH;
            break;
        }

    }

    /**
     * Method returns the name of the component
     * @return name 
     */
    public String getName(){
    return this.name;
    }


}
