package but.spring.restfulapi.controllers;

import but.spring.restfulapi.User;
import but.spring.restfulapi.model.dto.UserDto;
import but.spring.restfulapi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("")
    public ResponseEntity<?> getListUsers(){
        List<UserDto> users = userService.getListUsers();
        return  ResponseEntity.ok(users);
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable int id ){
        UserDto user = userService.getUserById(id);
       return  ResponseEntity.status(HttpStatus.OK).body(user);
    }
    @GetMapping("/search")
    public ResponseEntity<?> searchUser(@RequestParam(required = false,defaultValue = "") String keyword){
        List<UserDto> result = userService.searchUser(keyword);
        return ResponseEntity.ok(result);
    }

    @PostMapping("")
    public ResponseEntity<?> createUser(){
        return  null;
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> updateUser(){
        return  null;
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteUser(){
        return  null;
    }

    //    @RequestMapping(value = {"/hello-world","/hello"},method = RequestMethod.GET)
//    public User helloWorld(){
//        User user = new User("1","nguyễn thị mộng mơ");
//        return user;
//    }
//    @RequestMapping(value = {"/res","/response-req"},method = RequestMethod.GET)
//    public ResponseEntity<?> require(){
//        User user = new User("1","nguyễn thị mộng mơ");
//        return ResponseEntity.status(HttpStatus.OK).body(user);
//    }

}
