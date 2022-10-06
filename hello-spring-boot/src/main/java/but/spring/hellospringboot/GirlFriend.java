package but.spring.hellospringboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary  set độ ưu tiên cho class này, hoặc sử dụng @Qualifier

public class GirlFriend  {
    @Autowired
    @Qualifier("Bikini")
    Outfit outfit;

    public GirlFriend() {
    }

    public GirlFriend(Outfit outfit) {
        this.outfit = outfit;
    }

    public Outfit getOutfit() {
        return outfit;
    }

    public void setOutfit(Outfit outfit) {
        this.outfit = outfit;
    }

    public void wear() {
        System.out.println("wearing dress");
    }
}
