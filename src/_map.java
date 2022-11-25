import java.util.HashMap;
import java.util.Map;

public class _map {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "alex");
        map.put(2, "alexa");
        map.put(3, "alexi");
        map.put(3, "alexo");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.keySet());
        System.out.println(map.entrySet());
        map.remove(3);
        map.entrySet().forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));
    }   
}