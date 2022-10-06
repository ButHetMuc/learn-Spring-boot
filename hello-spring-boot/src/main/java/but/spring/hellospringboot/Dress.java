package but.spring.hellospringboot;

import org.springframework.stereotype.Component;

@Component("Dress")
public class Dress implements Outfit{
    @Override
    public void wear(){
        System.out.println("wearing dress ");
    }
}
