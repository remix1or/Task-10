package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getUsers();
    User getUserById(int id);
    void updateUser(int id, User user);
    void deleteUser(int id);
    User getUserName(String name);
}
