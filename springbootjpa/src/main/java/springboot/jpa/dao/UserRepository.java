package springboot.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import springboot.jpa.entities.User;

public interface UserRepository extends CrudRepository<User, Integer>{

}
