import java.io.*;
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

    }

}
