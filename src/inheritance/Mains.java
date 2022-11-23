package inheritance;

public class Mains {
    public static void main(String[] args){
        person n = new person("bakit", "ako", 90);
        toddler t = new toddler("bakit", "sya", 56, "basketball");
        tofdauther to = new tofdauther(null, null, 0, null, null);

        t.checkStatus();
    }
}
