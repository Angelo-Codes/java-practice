package polymorphism;

public class Mainss {
    
    public static void main(String[] args){
        // dog d = new dog();
        // cat c = new cat();


        // d.voice();
        // c.voice();

        kalaban w = new weakkalaban();
        kalaban s = new strongkalaban();

        w.showstats();
        s.showstats();
    }
}