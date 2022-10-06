package but.spring.SpringJWT.service;

import but.spring.SpringJWT.model.Role;
import but.spring.SpringJWT.model.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
