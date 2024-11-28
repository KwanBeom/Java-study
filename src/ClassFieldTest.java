public class ClassFieldTest {
    public static void main(String[] args) {
        ClassField cf1 = new ClassField();
        ClassField cf2 = new ClassField();
        System.out.println(cf1.cnt);
        System.out.println(cf2.cnt);
        ClassField.cnt++;
        System.out.println(cf1.cnt);
        System.out.println(cf2.cnt);
    }
}
