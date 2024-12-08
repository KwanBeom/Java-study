package miniProject;

import java.util.List;

public class UserMain {
    public static void main(String[] args) {
        UserMain app = new UserMain();
        app.run();
    }

    private void run() {
        UserUI userUI = new UserUI();
        UserDao userDao = new UserDao("src/tmp/users.dat");
        UserService userService = new UserServiceInMemory(userDao.getUsers());
        boolean running = true;

        while (running) {
            int menuId = userUI.menu();
            running = processMenu(menuId, userUI, userService, userDao);
        }
    }

    private boolean processMenu(int menuId, UserUI userUI, UserService userService, UserDao userDao) {
        switch (menuId) {
            case UserUI.COMMAND_EXIT -> exitProgram(userDao, userService.getUsers());
            case UserUI.COMMAND_REGISTER -> handleRegister(userUI, userService);
            case UserUI.COMMAND_VIEW -> handleView(userUI, userService);
            case UserUI.COMMAND_EDIT -> handleEdit(userUI, userService);
            case UserUI.COMMAND_DELETE -> handleDelete(userUI, userService);
            default -> System.out.println("올바르지 않은 선택입니다.");
        }
        return menuId != UserUI.COMMAND_EXIT;
    }

    private void exitProgram(UserDao userDao, List<User> users) {
        System.out.println("종료합니다.");
        userDao.saveUser(users);
    }

    private void handleRegister(UserUI userUI, UserService userService) {
        User user = userUI.regUser();
        if (user != null) {
            userService.addUser(user);
            System.out.println("등록 완료");
        } else {
            System.out.println("등록 실패: 유효하지 않은 입력입니다.");
        }
    }

    private void handleView(UserUI userUI, UserService userService) {
        List<User> users = userService.getUsers();
        if (users.isEmpty()) {
            System.out.println("등록된 회원이 없습니다.");
        } else {
            userUI.printUserList(users);
        }
    }

    private void handleEdit(UserUI userUI, UserService userService) {
        String email = userUI.getEmail();
        if (userService.isExistUser(email)) {
            System.out.println("수정할 회원 정보를 찾을 수 없습니다.");
            return;
        }
        User updatedUser = userUI.editUser(email);
        if (userService.updateUser(updatedUser)) {
            System.out.println("회원 정보가 수정되었습니다.");
        } else {
            System.out.println("회원 정보 수정에 실패했습니다.");
        }
    }

    private void handleDelete(UserUI userUI, UserService userService) {
        String email = userUI.getEmail();
        if (userService.isExistUser(email)) {
            System.out.println("삭제할 회원 정보를 찾을 수 없습니다.");
            return;
        }
        if (userService.deleteUser(email)) {
            System.out.println("삭제 완료");
        } else {
            System.out.println("삭제 실패");
        }
    }
}