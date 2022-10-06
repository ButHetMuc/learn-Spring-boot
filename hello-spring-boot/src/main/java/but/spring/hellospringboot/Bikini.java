package but.spring.hellospringboot;

import org.springframework.stereotype.Component;

@Component("Bikini")
public class Bikini implements Outfit {

    @Override
    public void wear() {
        System.out.println("wearing dress");
    }
}
