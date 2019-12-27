package br.com.empresa.app.repositories;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.empresa.app.entities.User;

@Repository
public interface UserRepository extends GenericRepository<User, Long>{

	Optional<User> findByEmail(String email);
	
}
