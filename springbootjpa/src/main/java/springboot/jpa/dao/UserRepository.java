package springboot.jpa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springboot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	public List<User> findByNameAndCity(String name, String city);
	public List<User> findByNameContaining(String words);
}
