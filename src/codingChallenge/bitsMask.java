package codingChallenge;

public class bitsMask {
    public int solution(int A, int B, int C){
        int sum = A + B + C;
        return sum;
    }

    public static void main(String[] args) {
        bitsMask cal = new bitsMask();
        System.out.println(cal.solution(12,23,34));
    }
}