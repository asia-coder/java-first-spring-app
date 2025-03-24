package com.todo_app.todo.service;

import com.todo_app.todo.exception.UserAlreadyExistException;
import com.todo_app.todo.model.User;
import com.todo_app.todo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> userList() {
        return this.userRepository.findAll();
    }

    public User create(User user) throws UserAlreadyExistException {
        Optional<User> userOptional = this.userRepository.findByEmail(user.getEmail());

        if (userOptional.isPresent()) {
            throw new UserAlreadyExistException("Пользователь с таким email уже существует");
        }

        user.setAge(Period.between(user.getBirth(), LocalDate.now()).getYears());
        return this.userRepository.save(user);
    }

    public void delete(Long id) {
        this.userRepository.deleteById(id);
    }

    public User update(Long id, String name) throws Exception {
        Optional<User> userOptional = this.userRepository.findById(id);

        if (userOptional.isEmpty()) {
            throw new Exception("Пользователь не существует");
        }

        User user = userOptional.get();
        if (name != null && !name.equals(user.getName())) {
            user.setName(name);
        }

        return this.userRepository.save(user);
    }
}
