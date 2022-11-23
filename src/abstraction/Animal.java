package abstraction;

public abstract class Animal {
    String name;
    abstract void makesound();

    void showname(){
        System.out.println(name);
    }

    void setname(String name){
        this.name = name;
    }
    
}
