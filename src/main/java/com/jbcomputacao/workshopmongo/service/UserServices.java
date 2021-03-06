package com.jbcomputacao.workshopmongo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jbcomputacao.workshopmongo.DTO.UserDTO;
import com.jbcomputacao.workshopmongo.domain.User;
import com.jbcomputacao.workshopmongo.repository.UserRepository;
import com.jbcomputacao.workshopmongo.service.Exception.ObjectNotFoundException;

@Service
public class UserServices {
	

	@Autowired
	private UserRepository repo;
	
	public List<User>findAll(){
		return repo.findAll();

		
		
		
	}
	public User findById(String id) {
		User user = repo.findById(id).orElse(null);
		if (user == null) {
			throw new ObjectNotFoundException("Objeto não Encontrado");
			
		}
		return user;
		
		
	}
	public User insert(User obj) {
		return repo.insert(obj);
		
	}
	
	public void delete(String id) {
		findById(id);
		repo.deleteById(id);
		
	}
	
	public User fromDTO(UserDTO objDto) {
		
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
	}
	
	

}
