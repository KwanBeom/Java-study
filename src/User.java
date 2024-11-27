public class User {
    private final String name;
    private final String gender;
    private final int age;

    User(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public static void main(String[] args) {

    }

    public void hello() {
        System.out.println("hello my name is " + this.name + " i'm " + this.gender);
        System.out.println("my age is " + this.age);
    }
}