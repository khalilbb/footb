package service;

import deo.UserDao;
import model.User;

public interface UserService {
    User signup(UserDao userDao);
    User login(String username, String password);
    User getUserById(Long userId);
    User updateUser(UserDao userDao, Long userId);
    void deleteUser(Long userId);
}
