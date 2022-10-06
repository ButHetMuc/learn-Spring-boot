package but.springboot.springbootactivemq.controller;

import but.springboot.springbootactivemq.service.DispatcherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MessageController {
    @Autowired
    DispatcherService dispatcherService;

    public ResponseEntity<String> send(@RequestBody String message){
        dispatcherService.sendMessage(message);
        return new  ResponseEntity<>("Message send: " + message, HttpStatus.OK);
    }
}
