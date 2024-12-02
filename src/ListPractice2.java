import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ListPractice2 {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();

        collection.add("HI");
        collection.add("bye");
        Iterator<String> iterator = collection.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
