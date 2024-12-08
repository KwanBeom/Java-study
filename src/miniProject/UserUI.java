package miniProject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class UserUI {
    static public final int COMMAND_REGISTER = 1;
    static public final int COMMAND_VIEW = 2;
    static public final int COMMAND_EDIT = 3;
    static public final int COMMAND_DELETE = 4;
    static public final int COMMAND_EXIT = 5;
    private final BufferedReader br;

    public UserUI() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    public int menu() {
        System.out.println(COMMAND_REGISTER + ". 회원등록");
        System.out.println(COMMAND_VIEW + ". 회원 목록 보기");
        System.out.println(COMMAND_EDIT + ". 회원 정보 수정하기");
        System.out.println(COMMAND_DELETE + ". 회원 삭제");
        System.out.println(COMMAND_EXIT + ". 종료");
        int menuId = -1;
        try {
            String line = br.readLine();
            menuId = Integer.parseInt(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return menuId;
    }

    public User regUser() {
        try {
            String email = getEmail();
            String name = getName();
            int birthYear = getBirthYear();
            return new User(name, email, birthYear);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getEmail() {
        String email = "";
        try {
            System.out.println("이메일을 입력하세요");
            email = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return email;
    }

    public String getName() {
        String name = "";
        try {
            System.out.println("이름을 입력하세요");
            name = br.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return name;
    }

    public int getBirthYear() {
        int birthYear = 0;
        try {
            System.out.println("생년을 입력하세요");
            birthYear = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return birthYear;
    }

    public User editUser(String email) {
        try {
            System.out.println(email + " 회원의 정보를 수정합니다.");
            String name = getName();
            int birthYear = getBirthYear();
            return new User(name, email, birthYear);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void printUserList(List<User> users) {
        System.out.println("email           이름            생년");
        for (User user : users) {
            String email = user.getEmail();
            String name = user.getName();
            int birth = user.getBirthYear();
            System.out.print(email);
            System.out.print("     ");
            System.out.print(name);
            System.out.print("     ");
            System.out.print(birth);
            System.out.println("\n");
        }
    }
}
