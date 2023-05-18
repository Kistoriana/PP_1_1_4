package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();

        userDaoJDBC.createUsersTable();

        userDaoJDBC.saveUser("Михаил", "Булгаков", (byte) 30);
        System.out.println("User с именем – " + userDaoJDBC.getAllUsers().get(0).getName() + " добавлен в базу данных");
        userDaoJDBC.saveUser("Федор", "Достоевский", (byte) 19);
        System.out.println("User с именем – " + userDaoJDBC.getAllUsers().get(1).getName() + " добавлен в базу данных");
        userDaoJDBC.saveUser("Иосиф", "Бродский", (byte) 24);
        System.out.println("User с именем – " + userDaoJDBC.getAllUsers().get(2).getName() + " добавлен в базу данных");
        userDaoJDBC.saveUser("Анна", "Ахматова", (byte) 38);
        System.out.println("User с именем – " + userDaoJDBC.getAllUsers().get(3).getName() + " добавлен в базу данных");

        System.out.println(userDaoJDBC.getAllUsers().toString());
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
    }
}
