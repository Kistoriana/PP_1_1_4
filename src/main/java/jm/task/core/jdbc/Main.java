package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Михаил", "Булгаков", (byte) 30);
        System.out.println("User с именем – " + userService.getAllUsers().get(0).getName() + " добавлен в базу данных");
        userService.saveUser("Федор", "Достоевский", (byte) 19);
        System.out.println("User с именем – " + userService.getAllUsers().get(1).getName() + " добавлен в базу данных");
        userService.saveUser("Иосиф", "Бродский", (byte) 24);
        System.out.println("User с именем – " + userService.getAllUsers().get(2).getName() + " добавлен в базу данных");
        userService.saveUser("Анна", "Ахматова", (byte) 38);
        System.out.println("User с именем – " + userService.getAllUsers().get(3).getName() + " добавлен в базу данных");

        System.out.println(userService.getAllUsers().toString());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
