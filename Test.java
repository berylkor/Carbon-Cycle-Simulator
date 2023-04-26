public class Test{
    public static void main(String[] args){
        Animal lion = new Animal("Lion", 10, 0.3, 0);
        Decomposer bacteria = new Decomposer("Bacteria", 1.5, 0.03);
        Animal sheep = new Animal("Sheep", 8.0, 0.12, 0);
        Plant orange = new Plant("Orange", 6.0, 0.02, 3.4);
        
        orange.photosynthesize();
        orange.respire();
        sheep.respire();
        sheep.egest();
        sheep.feed(orange);
        lion.feed(sheep);
        lion.die();
        bacteria.decompose(lion);
        
    }
}