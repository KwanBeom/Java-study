import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {
    public static void main(String[] args) {
        ExceptionObj1 eob1 = new ExceptionObj1();
        int value1 = eob1.divide(10, 0);
        System.out.println(value1);

        ExceptionObj2 eob2 = new ExceptionObj2();
        int value2 = eob2.divide(10, 0);
        System.out.println(value2);
    }

    public void fileNotFoundExceptionPractice() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("User.java");
    }
}

class ExceptionObj1 {
    public int divide(int num1, int num2) {
        int value = 0;
        try {
            value = num1 / num2;
        } catch (ArithmeticException err) {
            System.out.println("0으로 나눌 수 없습니다.");
            System.out.println(err.toString());
        }
        return value;
    }
}

class ExceptionObj2 {
    /**
     * 두 수를 나누는 메소드
     *
     * @param num1 나눠질 수
     * @param num2 나눌 수
     * @return 몫
     * @throws ArithmeticException 수에 대한 예외
     */
    public int divide(int num1, int num2) throws ArithmeticException {
        return num1 / num2;
    }
}