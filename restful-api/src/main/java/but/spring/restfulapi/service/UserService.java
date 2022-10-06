package but.spring.restfulapi.service;

import but.spring.restfulapi.User;
import but.spring.restfulapi.model.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    public List<UserDto> getListUsers();
    public UserDto getUserById(int id);

    public List<UserDto> searchUser(String keyword);
}
