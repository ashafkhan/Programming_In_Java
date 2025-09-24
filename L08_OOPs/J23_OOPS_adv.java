package L08_OOPs;
public class J23_OOPS_adv {
    public static void main(String[] args){
        Fish shark=new Fish();
        shark.eat();
        shark.swim();
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("breathes");
    }
}
class Fish extends Animal{
    int fins;
    void swim(){
        System.out.println("Swims in water");
    }
}