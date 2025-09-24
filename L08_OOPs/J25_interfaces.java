package L08_OOPs;

public class J25_interfaces {
    public static void main(String[] args) {
        Bear ch = new Bear();
        ch.eatPlants();
        ch.eatMeat();
    }
}

// First interface
interface Herbivore {
    void eatPlants();
}

// Second interface
interface Carnivore {
    void eatMeat();
}

// Class implementing multiple interfaces
class Bear implements Herbivore, Carnivore {
    public void eatPlants() {
        System.out.println("Bear eats plants");
    }
    
    public void eatMeat() {
        System.out.println("Bear eats animals");
    }
}

