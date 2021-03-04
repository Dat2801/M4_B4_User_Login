package service;

import model.Login;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class DAO {
    private static List<User> users = new ArrayList<>();

    static {
        User u1 = new User();
        u1.setAge(10);
        u1.setName("Dat");
        u1.setAccount("Dat");
        u1.setEmail("john@codegym.vn");
        u1.setPassword("123456");
        users.add(u1);

        User u2 = new User();
        u2.setAge(15);
        u2.setName("Tu");
        u2.setAccount("Tu");
        u2.setEmail("bill@codegym.vn");
        u2.setPassword("123456");
        users.add(u2);

        User u3 = new User();
        u3.setAge(16);
        u3.setName("Tung");
        u3.setAccount("Tung");
        u3.setEmail("mike@codegym.vn");
        u3.setPassword("123456");
        users.add(u3);
    }

    public static User checkLogin(Login login) {
        for (User user : users) {
            if (user.getAccount().equals(login.getAccount()) && user.getPassword().equals(login.getPassword())) {
                return user;
            }
        }
        return null;
    }
}
