package enumarators;

public class Mains {
    public static void main(String[] args){

        PhpCurrency currency[] = new PhpCurrency[3];
        currency[0] = PhpCurrency.Dime;
        currency[1] = PhpCurrency.Nickle;
        currency[2] = PhpCurrency.Quarter;

        float sum = 0;
        for(PhpCurrency curent: currency){
            sum += curent.val;
        }
        System.out.println(sum);



















    //category cat = category.EASY;

    // if(cat == category.MEDIUM) System.out.println("for master");
    // else if(cat == category.EASY) System.out.println("for newbie");
    // else if(cat == category.HARD) System.out.println("for pro");

    // switch(cat){
    //     case EASY:
    //     System.out.println("for master");
    //     break;
    //     case MEDIUM:
    //     System.out.println("for newbie");
    //     break;
    //     case HARD:
    //     System.out.println("for pro");
    //     break;
    // }

    }

}
