package but.springboot.springbootactivemq.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

@Service
public class ReceiveService {
    Logger log = LoggerFactory.getLogger(ReceiveService.class);

    @JmsListener(destination = "${jms.queue}")
    public void receiveMessage(String message){
        log.info("received message: "+message);
    }
}
