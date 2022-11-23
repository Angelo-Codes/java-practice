package inheritance;

public class tofdauther extends toddler{

    String toy;
    tofdauther(String name, String sex, int age, String favorite, String toy){
        super(name,sex,age,favorite);
        this.toy = toy;
    }
}
