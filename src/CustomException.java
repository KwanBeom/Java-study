class ExceptionObj {
    public void run() throws MyException {
        throw new MyException("사용자 정의 에러 발생!!");
    }
}

class MyException extends RuntimeException {
    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable cause) {
        super(cause);
    }
}

public class CustomException {
    public static void main(String[] args) {
        try {
            new ExceptionObj().run();
        } catch (MyException myException) {
            System.out.println(myException.toString());
        }
    }
}