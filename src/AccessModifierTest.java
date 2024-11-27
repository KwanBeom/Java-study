public class AccessModifierTest {
    public static void main(String[] args) {
        AccessModifier am = new AccessModifier();
        am.defaultString = "123";
        am.protectedString = "123";
        System.out.println(am.protectedString);
        System.out.println(am.defaultString);

    }
}