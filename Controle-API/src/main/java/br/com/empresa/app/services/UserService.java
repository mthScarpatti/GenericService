package br.com.empresa.app.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.empresa.app.entities.User;

@Service
public interface UserService extends GenericService<User, Long>{
	
	Optional<User> findByEmail(String email);
}
