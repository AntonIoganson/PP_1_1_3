package jm.task.core.jdbc;

import antlr.Utils;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserService userService = new UserServiceImpl();
        userService.createUsersTable();

        userService.saveUser("name1", "lastname1", (byte) 20);
        userService.saveUser("name2", "lastname2", (byte) 20);
        userService.saveUser("name3", "lastname3", (byte) 20);
        userService.saveUser("name4", "lastname4", (byte) 20);

        List<User> users = userService.getAllUsers();
        System.out.println(users);

        userService.cleanUsersTable();
        userService.dropUsersTable();


    }
}
