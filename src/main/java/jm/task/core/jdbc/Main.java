package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Mikle",  "Scott", (byte) 40);
        userService.saveUser("Olga", "Nesterova", (byte)30);
        userService.saveUser("Dima", "Shtanov", (byte)35);
        userService.saveUser("Anna", "Andreeva", (byte)20);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
