public enum Gender {
    MALE("XY"),
    FEMALE("XX");

    private final String chromosome;

    private Gender(String chromosome) {
        this.chromosome = chromosome;
    }

    public void print() {
        System.out.println(chromosome);
    }

    @java.lang.Override
    public String toString() {
        return "Gender{" +
                "chromosome='" + chromosome + '\'' +
                '}';
    }
}
