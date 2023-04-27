import java.util.*;

public class Environment {

    private String name;
    public final NonLiving soil = new NonLiving("soil", "sink", 10.00, 45.0);
    public final NonLiving atmosphere = new NonLiving ("atmosphere","both", 13.00, 45.0);
    public final NonLiving ocean = new NonLiving ("ocean","sink", 15.00, 20.00);
    private ArrayList <Plant> plants = new ArrayList<Plant>();
    private ArrayList <Animal> animals = new ArrayList<Animal>();
    private ArrayList <Decomposer> decomposers = new ArrayList<Decomposer>();

    public Environment(String name){
        this.name = name;    
    }

    public boolean addPlant(Plant plant){
        return plants.add(plant);
    }

    public boolean addAnimal (Animal animal){
        return animals.add(animal);
    }

    public boolean addDecomposer(Decomposer decomposer){
        return decomposers.add(decomposer);
    }

    public boolean removePlant(Plant plant){
        return plants.remove(plant);
    }

    public boolean removeAnimal(Animal animal){
        return animals.remove(animal);
    }

    public boolean removeDecomposer(Decomposer decomposer){
        return decomposers.remove(decomposer);
    }

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
    
    public void temperatureWarning(){
    
        if (!this.soil.checkTemperature()){
            System.out.println("Warning: Current Temperature of soil is outside optimum temperature range")
        }else{
            System.out.println("Current Temperature of soil is within optimum range")
        }
        
        if (!this.atmosphere.checkTemperature()){
            System.out.println("Warning: Current Temperature of atmosphere is outside optimum temperature range")
        }else{
            System.out.println("Current Temperature of atmosphere is within optimum range")
        }
        
        if (!this.ocean.checkTemperature()){
            System.out.println("Warning: Current Temperature of ocean is outside optimum temperature range")
        }else{
            System.out.println("Current Temperature of ocean is within optimum range");
        }
    }
    
    public void carbonContentWarning(){
    
        if (!this.soil.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of soil is outside the optimum carbon content range")
        }else{
            System.out.println("Current carbon content of soil is within the optimum carbon content range")
        }
        
        if (!this.atmosphere.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of atmosphere is outside the optimum carbon content range")
        }else{
            System.out.println("Current Current carbon content of atmosphere is within the optimum carbon content range")
        }
        
        if (!this.ocean.checkCarbonContent()){
            System.out.println("Warning: Current carbon content of ocean is outside the optimum carbon content range")
        }else{
            System.out.println("Current carbon content of ocean is within the optimum carbon content range");
        }
    }

}
