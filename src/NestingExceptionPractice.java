public class NestingExceptionPractice {
    public static void main(String[] args) {
        int[] array = {4};
        int[] value = new int[1];
        try {
            value[0] = array[0] / array[1];
        } catch (ArrayIndexOutOfBoundsException aiob) {
            System.out.println(aiob.toString());
        } catch (ArithmeticException ae) {
            System.out.println(ae.toString());
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}
