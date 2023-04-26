public abstract class Component{
    enum Types {SINK, SOURCE, BOTH}
    protected Types type;
    protected String name;
    protected static Environment environment = new Environment("forest");

    public Component(String componentName, String componentType){
        this.name = componentName;
        String typeLowerCase = componentType.toLowerCase();
        
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

    public String getName(){
    return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}