package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;
import peaksoft.service.UserServiceImpl;
import peaksoft.util.Util;

public class Main {
    public static void main(String[] args) {

        // реализуйте алгоритм здесь
     //   userDao.createUsersTable();
        UserServiceImpl userService = new UserServiceImpl();
//       userService.createUsersTable();
//        userService.dropUsersTable();

//        userService.saveUser("Daniel", "Toktosunov", (byte) 18);
//        userService.saveUser("Talant", "Zhanybaev", (byte) 23);
//        userService.saveUser("Siymik", "Bayaliev", (byte) 21);
//        userService.saveUser("Riskeldi", "Osmonaliev", (byte) 25);

      System.out.println(userService.getAllUsers());
    }
}
