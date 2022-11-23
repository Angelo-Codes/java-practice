package inheritance;

public class toddler extends person{
    String favorite;
    toddler(String name, String sex, int age, String favorite){
        super(name,sex,age);
        this.favorite = favorite;
    }

    void drink(){
        System.out.println(age + " Is drinking sweet water");
    }

    void checkStatus(){
        super.checkStatus();
        System.out.println("row" + favorite);
    }

}