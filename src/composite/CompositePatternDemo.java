package composite;

public class CompositePatternDemo {
    public static void main(String[] args) {
        File f1 = new File("f1", 10L);
        File f2 = new File("f2", 10L);
        File f3 = new File("f3", 10L);

        Folder folder = new Folder("folder1");

        folder.add(f1);
        folder.add(f2);
        folder.add(f3);

        System.out.println(folder.getSize());
    }
}
