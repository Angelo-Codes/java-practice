package polymorphism;

public class weakkalaban extends kalaban{
    
    weakkalaban(){
        name = "ako ay gulayat";
        heart = 0;
    }

    weakkalaban(String name){
        this.name = name;
    }

    void voice(){
        System.out.println("im week enemy");
    }
    
}
