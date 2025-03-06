package ru.kata.spring.boot_security.demo.userMapper;


import org.springframework.stereotype.Component;
import ru.kata.spring.boot_security.demo.model.User;

@Component
public class UserMapper {

    public User toUser(User entity, User updatedUser) {
        entity.setUsername(updatedUser.getUsername());
        entity.setAge(updatedUser.getAge());
        entity.setEmail(updatedUser.getEmail());

        if (updatedUser.getPassword() == null || updatedUser.getPassword().isEmpty()) {
            entity.setPassword(entity.getPassword());
        }
//        entity.setPassword(updatedUser.getPassword());
        return entity;
    }
}
