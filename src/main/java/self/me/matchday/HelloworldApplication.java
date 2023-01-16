package self.me.matchday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import self.me.matchday.model.entity.Entity;

@SpringBootApplication
public class HelloworldApplication {

	public static void main(String[] args) {
		Entity entity = new Entity();
		entity.setAge(1);
		SpringApplication.run(HelloworldApplication.class, args);
		System.out.println("helloworld application success...");
		System.out.println("entity.getAge() = " + entity.getAge());
	}

}
