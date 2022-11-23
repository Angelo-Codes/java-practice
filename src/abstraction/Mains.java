package abstraction;

public class Mains {
    public static void main(String[] args){
        //Abstract idea
        // Animal a = new Animal();

        //concrete idea
        Animal d = new Dog();
        Animal c = new Cat();
        d.makesound();
        c.makesound();
        d.setname("aso");
        c.setname("pusa");
        d.showname();
        c.showname();
    }
}
