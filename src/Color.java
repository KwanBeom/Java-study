public enum Color implements Printer {
    RED("FF0000"),
    BLUE("0000FF"),
    GREEN("00FF00");

    private final String rgb;

    private Color(String rgb) {
        this.rgb = rgb;
    }


    @java.lang.Override
    public void print() {
        System.out.println(this.rgb);
    }
}
