public class AccessModifier {
    public String publicString = "public";
    protected String protectedString = "protected";
    String defaultString = "default";
    private String privateString = "private";

    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return this.num;
    }
}
