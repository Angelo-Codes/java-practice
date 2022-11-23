package codingChallenge;

public class stringReverse {

    static void reverse(String s){
        char letters[] = new char[s.length()];
        int lettersIndex = 0;

        for(int i = s.length() - 1; i >= 0; i++){
            letters[lettersIndex] = s.charAt(i);
            lettersIndex++;
        }

        for(int i = 0; i < s.length(); i++){
            System.out.print(letters[i]);
        }

    }
    public static void main(String[] args) {
        reverse("sfdf");
    }
}
