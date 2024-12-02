import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        boolean flag1 = set.add("hello");
        boolean flag2 = set.add("hi");
        boolean flag3 = set.add("bye");
        boolean flag4 = set.add("good bye");
        boolean flag5 = set.add("good bye");
        System.out.println(flag4);
        System.out.println(flag5);

        Set<MyData> mySet = new HashSet<>();
        mySet.add(new MyData("kim", 100));
        mySet.add(new MyData("choi", 100));
        mySet.add(new MyData("park", 100));
        mySet.add(new MyData("lee", 100));
        mySet.add(new MyData("lee", 100));

        Iterator<MyData> iterator = mySet.iterator();
        for (MyData myData : mySet) {
            System.out.println(myData);
        }
    }
}

class MyData {
    private String name;
    private int value;

    public MyData(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyData myData = (MyData) o;
        return value == myData.value && Objects.equals(name, myData.name);
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @java.lang.Override
    public String toString() {
        return "MyData{" +
                "name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}