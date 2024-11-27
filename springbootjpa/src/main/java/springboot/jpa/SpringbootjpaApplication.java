package springboot.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import springboot.jpa.dao.UserRepository;
import springboot.jpa.entities.User;

@SpringBootApplication
public class SpringbootjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringbootjpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		User user = new User();
		user.setName("Vidur");
		user.setCity("Meerut");
		user.setStatus("Active");

		User user1 = userRepository.save(user);
		System.out.println(user1);
	}

}
