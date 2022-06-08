package ru.kata.springbootbootstrap.dao;

import ru.kata.springbootbootstrap.model.Role;
import java.util.List;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRole(String userRole);

    Role getRoleById(Long id);

    void addRole(Role role);
}
