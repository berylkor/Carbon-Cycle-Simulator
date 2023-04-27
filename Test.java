public class Main{
    public static void main(String[] args){

        Environment ourEnvironment = Component.environment;
        ourEnvironment.environmentReport();

        //Creating the inhabitants of the environment
        Animal lion = new Animal("Lion", 5, 0.3, 0);
        Animal dog = new Animal("Dog", 5, 0.3, 0);
        Decomposer bacteria = new Decomposer("Bacteria", 1.5, 0.03);
        Animal sheep = new Animal("Sheep", 4, 0.12, 0);
        Plant orange = new Plant("Orange", 3.0, 0.02, 3.4);
        Plant mango = new Plant("Mango", 50.0, 0.02, 3.4);      
        Human adam = new Human("Adam",5, 0.3, 0);

        //The cycle starts from plants who absorb Carbon from the atmosphere by undergoing photosynthesis
        orange.photosynthesize();
        mango.photosynthesize();

        ourEnvironment.environmentReport();

        //The organisms respire to release carbon into the atmosphere
        orange.respire();
        mango.respire();
        sheep.respire();
        bacteria.respire();
        lion.respire();
        dog.respire();

        //The animals prey on each other leading to a transfer of carbon from one organism to the other
        sheep.feed(orange);
        lion.feed(sheep);

        ourEnvironment.environmentReport();

         //Egestion also transfers carbon to the soil
         dog.egest();
         lion.egest();

         ourEnvironment.environmentReport();

        // The death and decomposition of animals transfers the carbon to the soil
        lion.die();
        bacteria.decompose(lion);

        ourEnvironment.environmentReport();

        // Human burning disrupts the carbon cycle, and increases the levels of carbon.

        while(ourEnvironment.atmosphere.checkCarbonContent()){
            adam.burn(mango);
        }
           ourEnvironment.environmentReport();

        
    }
}
