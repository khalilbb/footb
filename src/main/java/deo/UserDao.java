package deo;


import model.User;

import java.util.List;

public interface UserDao {
    User findById(Long id);
    User findByUsername(String username);
    User save(User user);
    void delete(User user);
    // Additional methods
    List<User> findAll();
    List<User> findByRole(String role);
    // Add more methods as needed
}
