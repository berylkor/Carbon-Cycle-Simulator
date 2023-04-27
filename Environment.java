import java.util.*;
    /** 
    * This class models an environment 
    * @author Kwame Brako Asante, Beryl Awurama Ayaw Koram, Valerie Maame Abena Ackon
    */

public class Environment {
    
    // instance variables
    private String name;
    public final NonLiving soil = new NonLiving("soil", "sink", 10.00, 45.0);
    public final NonLiving atmosphere = new NonLiving ("atmosphere","both", 13.00, 45.0);
    public final NonLiving ocean = new NonLiving ("ocean","sink", 15.00, 20.00);
    private ArrayList <Plant> plants = new ArrayList<Plant>();
    private ArrayList <Animal> animals = new ArrayList<Animal>();
    private ArrayList <Decomposer> decomposers = new ArrayList<Decomposer>();
    
    // constructor that sets the name of the environment
    public Environment(String name){
        this.name = name;    
    }
    /**
    * This method add an object of the plant class
    * @return boolean 
    */
    public boolean addPlant(Plant plant){
        return plants.add(plant);
    }
    
    /**
    * This method add an object of the animal class
    * @return boolean
    */
    public boolean addAnimal (Animal animal){
        return animals.add(animal);
    }
    
    /**
    * This method add an object of the decomposer class
    * @return boolean 
    */
    public boolean addDecomposer(Decomposer decomposer){
        return decomposers.add(decomposer);
    }
    
    /**
    * This method removes an object of the plant class
    * @return boolean
    */
    public boolean removePlant(Plant plant){
        return plants.remove(plant);
    }
    
    /**
    * This method removes an object of the animal class
    * @return boolean
    */
    public boolean removeAnimal(Animal animal){
        return animals.remove(animal);
    }
    
    /*
    * This method removes an object of the decomposer class
    * @return boolean 
    */
    public boolean removeDecomposer(Decomposer decomposer){
        return decomposers.remove(decomposer);
    }
    
    /*
    * This method prints the state of the atmosphere, soil and ocean
    * It then displays the names of all plants, animals and decomposers in the ArrayList
    */
    public void environmentReport(){
        System.out.println("Atmosphere:\n"+ this.atmosphere);
        System.out.println("Soil:\n"+ this.soil);
        System.out.println("Ocean:\n"+ this.ocean);

        System.out.println("Plants: ");
        plants.forEach((plant)-> System.out.println(plant.getName()));

        System.out.println("Animals: ");
        animals.forEach((animal)-> System.out.println(animal.getName()));

        System.out.println("Decomposers: ");
        decomposers.forEach((decomposer)-> System.out.println(decomposer.getName()));
    }
    
    /**
    * This method uses the checkTemperature method from the Non living class
    * It displays a warning message if the temperature is not within optimum
    */
    public void temperatureWarning(){
        // checks for the temperature of the soil
        if (!this.soil.checkTemperature()){
            System.out.println("Warning: Current Temperature of soil is outside optimum temperature range");
        }else{
            System.out.println("Current Temperature of soil is within optimum range");
        }
        // checks for the temperature of the atmosphere
        if (!this.atmosphere.checkTemperature()){
            System.out.println("Warning: Current Temperature of atmosphere is outside optimum temperature range");
        }else{
            System.out.println("Current Temperature of atmosphere is within optimum range");
        }
        // checks for the temperature of the ocean
        if (!this.ocean.checkTemperature()){
            System.out.println("Warning: Current Temperature of ocean is outside optimum temperature range");
        }else{
            System.out.println("Current Temperature of ocean is within optimum range");
        }
    }
    /**
    * This method uses the checkCarbonContent method from the Non living class
    * It displays a warning message if the carbon content is not within optimum
    */
    public void carbonContentWarning(){
        // checks for the carbon content of the soil
        if (!this.soil.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of soil is outside the optimum carbon content range");
        }else{
            System.out.println("Current carbon content of soil is within the optimum carbon content range");
        }
        // checks for the carbon content of the atmosphere
        if (!this.atmosphere.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of atmosphere is outside the optimum carbon content range");
        }else{
            System.out.println("Current Current carbon content of atmosphere is within the optimum carbon content range");
        }
        // checks for the carbon content of the ocean
        if (!this.ocean.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of ocean is outside the optimum carbon content range");
        }else{
            System.out.println("Current carbon content of ocean is within the optimum carbon content range");
        }
    }

}
