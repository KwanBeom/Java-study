public class Override {
    public static void main(String[] args) {
        Children c1 = new Children();
        System.out.println(c1.age);
        c1.printAge();
        Parent p1 = new Parent();
        System.out.println(p1.age);
        p1.printAge();

        Parent p2 = new Children();
        System.out.println(p2.age);
        p2.printAge();
    }
}
