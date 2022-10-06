package but.spring.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HelloSpringBootApplication {

	public static void main(String[] args) {

		ApplicationContext context=  SpringApplication.run(HelloSpringBootApplication.class, args);
		Outfit outfit = context.getBean(Outfit.class);
//		Dress dress1 = context.getBean(Dress.class);
//		Dress dress2 = context.getBean(Dress.class); -> dress1 & dress2 point to one address
		System.out.println("instance: " + outfit);
		outfit.wear();


//		GirlFriend girlFriend = context.getBean(GirlFriend.class);
//		System.out.println(girlFriend);
	}

}
