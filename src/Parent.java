import java.util.Objects;

public class Parent {
    int age = 50;

    public void printAge() {
        System.out.println("parent age = " + age);
    }

    @java.lang.Override
    public String toString() {
        return "Parent{" +
                "age=" + age +
                '}';
    }

    @java.lang.Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parent parent = (Parent) o;
        return age == parent.age;
    }

    @java.lang.Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
