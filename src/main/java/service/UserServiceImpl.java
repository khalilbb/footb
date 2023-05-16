package service;

import deo.UserDao;
import model.User;
import repository.UserRepository;
import service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    public User registerUser(User user) {
        // Set the encoded password before saving the user
        String encodedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        return userRepository.save(user);
    }

    @Override
    public User signup(UserDao userDao) {
        return null;
    }

    @Override
    public User login(String username, String password) {
        return null;
    }

    @Override
    public User getUserById(Long userId) {
        return null;
    }

    @Override
    public User updateUser(UserDao userDao, Long userId) {
        return null;
    }

    @Override
    public void deleteUser(Long userId) {

    }
    // Implement any other methods for user-related operations
}
