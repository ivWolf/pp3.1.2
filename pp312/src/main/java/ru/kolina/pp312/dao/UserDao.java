package ru.kolina.pp312.dao;



import ru.kolina.pp312.model.User;

import java.util.List;

public interface UserDao {
    void saveUser(User user);

    void updateUser(User user);

    List<User> getUsers(Integer count);

    void deleteUser(User user);

    User getUserById(Long id);
}
