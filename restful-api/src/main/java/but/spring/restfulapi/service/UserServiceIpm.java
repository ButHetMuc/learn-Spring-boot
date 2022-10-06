package but.spring.restfulapi.service;

import but.spring.restfulapi.User;
import but.spring.restfulapi.exeption.NotFoundException;
import but.spring.restfulapi.model.dto.UserDto;
import but.spring.restfulapi.model.dto.mapper.UserMapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceIpm implements  UserService{
    private static ArrayList<User> users = new ArrayList<User>();

    static {
        users.add(new User(1,"Ronaldo","ronaldo@gmail.com","1233444","avatar.png","password1"));
        users.add(new User(2,"messi","messi@gmail.com","1233444","avatar.png","password2"));
        users.add(new User(3,"romeo","romeo@gmail.com","1233444","avatar.png","password3"));
        users.add(new User(4,"juliet","juliet@gmail.com","1233444","avatar.png","password4"));
    }

    @Override
    public List<UserDto> getListUsers() {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user: users){
            result.add(UserMapper.toUserDto(user));
        }
        return result;
    }

    @Override
    public UserDto getUserById(int id) {
        for(User user: users){
            if (user.getId() == id){
                UserDto userDto = UserMapper.toUserDto(user);
                return userDto;
            }
        }
        throw  new NotFoundException("user khong ton tai ");
    }

    @Override
    public List<UserDto> searchUser(String keyword) {
        List<UserDto> result = new ArrayList<UserDto>();
        for (User user: users){
            if (user.getName().contains(keyword)){
                result.add(UserMapper.toUserDto(user));
            }
        }
        return result;
    }
}
