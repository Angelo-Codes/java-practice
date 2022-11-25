import java.time.Period;
import java.util.LinkedList;
import java.util.Queue;

public class _Queues {
    public static void main(String[] args) {

        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("ala", 21));
        supermarket.add(new Person("al", 21));
        supermarket.add(new Person("alae", 21));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }
    static record Person(String name, int age){}
}
