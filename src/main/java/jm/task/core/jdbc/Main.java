package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

public class Main {
    public static void main(String[] args) {

        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Михаил", "Булгаков", (byte) 30);
        System.out.println("User с именем – " + userDao.getAllUsers().get(0).getName() + " добавлен в базу данных");
        userDao.saveUser("Федор", "Достоевский", (byte) 19);
        System.out.println("User с именем – " + userDao.getAllUsers().get(1).getName() + " добавлен в базу данных");
        userDao.saveUser("Иосиф", "Бродский", (byte) 24);
        System.out.println("User с именем – " + userDao.getAllUsers().get(2).getName() + " добавлен в базу данных");
        userDao.saveUser("Анна", "Ахматова", (byte) 38);
        System.out.println("User с именем – " + userDao.getAllUsers().get(3).getName() + " добавлен в базу данных");

        System.out.println(userDao.getAllUsers().toString());
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
    }
}
