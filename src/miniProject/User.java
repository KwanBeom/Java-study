package miniProject;

import java.io.Serializable;

/**
 * 유저 정보에 대한 클래스
 *
 * @author bk(< a href = " mailto : tkdwjfrhs4 @ gmail.com " > 최범관 < / a >)
 * @version 0.1
 * @since 2024.12
 */
public class User implements Serializable {
    private String name;
    private String email;
    private int BirthYear;

    public User(String name, String email, int BirthYear) {
        this.name = name;
        this.email = email;
        this.BirthYear = BirthYear;
    }

    /**
     * 유저의 이름을 반환
     *
     * @return 유저 이름
     */
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public int getBirthYear() {
        return BirthYear;
    }


}