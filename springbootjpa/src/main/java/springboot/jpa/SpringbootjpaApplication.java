package springboot.jpa;

import java.util.List;
import java.util.Optional;

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
		/*
		 * User user = new User(); user.setName("Vidur"); user.setCity("Meerut");
		 * user.setStatus("Active");
		 * 
		 * User user1 = userRepository.save(user); System.out.println(user1);
		 * 
		 * //create User user2 = new User(); user2.setName("Agarwal");
		 * user2.setCity("Uttar Pradesh"); user2.setStatus("Active");
		 * 
		 * User user3 = userRepository.save(user2); System.out.println(user3);
		 * 
		 * List<User> list = List.of(user,user2,user3); userRepository.saveAll(list);
		 */
		//read
		Optional<User> optional = userRepository.findById(102);
		User user = optional.get();
//		System.out.println(user);
//		
//		//read all
//		System.out.println(userRepository.findAll());
//		
//		//update
//		
//		user.setName("Vidur Agarwal");
//		User user1 = userRepository.save(user);
//		System.out.println("Updated user "+ user1);
		
		userRepository.delete(user);
	}

}
