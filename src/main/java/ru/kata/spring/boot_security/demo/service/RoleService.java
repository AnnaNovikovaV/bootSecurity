package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> findAll();
    Role findById(int id);
    void save(Role role);
    void deleteById(int id);
//    List<Role> findRolesByIds(Set<Integer> roleIds);
}
