import java.util.Stack;
public class _Stack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
            stack.add(1);
            stack.add(2);
            stack.add(3);
            System.out.println(stack.peek());
            System.out.println(stack.size());
            System.out.println(stack.pop());
            System.out.println(stack.size());
            System.out.println(stack.empty());
    }
}
