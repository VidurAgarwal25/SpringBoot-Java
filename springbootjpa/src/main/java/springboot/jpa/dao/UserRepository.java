package springboot.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import springboot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

	public List<User> findByName(String name);
	
	public List<User> findByNameAndCity(String name, String city);
	
	public List<User> findByNameContaining(String words);
	
	@Query("select u from User u")	//JPQL
	public List<User> getAll();
	
	@Query("select u from User u where u.name = :n")		//JPQL
	public List<User> getByName(@Param("n") String name);
	
	@Query("select u from User u where u.name = :n and u.city = :c")		//JPQL
	public List<User> getByNameAndCity(@Param("n") String name, @Param("c") String city);
	
	@Query(value="select * from user",nativeQuery = true)
	public List<User> getAllUsersByNativeQuery();
}
