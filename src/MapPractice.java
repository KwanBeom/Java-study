import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("k1", "hi");
        map.put("k2", "hello");
        map.put("k3", "good");

        System.out.println(map.get("k1"));
    }
}
