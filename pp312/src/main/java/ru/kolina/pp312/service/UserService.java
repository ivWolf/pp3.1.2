package ru.kolina.pp312.service;


import ru.kolina.pp312.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsers(Integer count);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUser(User user);

    User getUserById(Long id);
}
