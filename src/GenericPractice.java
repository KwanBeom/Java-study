import java.util.Locale;

class GenericMain {
    public static void main(String[] args) {
        GenericPractice<String> gn = new GenericPractice<String>();
        gn.set("bk");
        String str = gn.get();
        System.out.println(str.toUpperCase());
    }
}

public class GenericPractice<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return this.t;
    }

}
