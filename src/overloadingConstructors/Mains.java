package overloadingConstructors;

public class Mains {
    public static void main(String[] args){
        employee em = new employee(null, null, null, null, null, 0);
        employee em2 = new employee("hahha", "hahha", "hahha");
        employee em3 = new employee();
        em3.setFisrtName("gaggaga", 9);

        System.out.println(em3.getFirstName());
        
    }
}
