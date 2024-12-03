/**
 * 유저 정보에 대한 클래스
 * @author bk(<a href="mailto:tkdwjfrhs4@gmail.com">최범관</a>)
 * @since 2024.12
 * @version 0.1
 */
public class User {
    private final String name;
    private final String password;

    public User(String name){
        this(name, null);
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * 유저의 이름을 반환
     * @return 유저 이름
     */
    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }
}