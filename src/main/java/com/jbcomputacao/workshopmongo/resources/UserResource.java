package com.jbcomputacao.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jbcomputacao.workshopmongo.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)

	
	public ResponseEntity<List<User>>findAll(){
		User maria = new User("1","maria silva","maria@gmail.com");
		User alex = new User("2","alex santos","alex@gmil.com");
		User Jairo = new User("3","Jairo Paixao","jbcomputacao@gmil.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria,alex,Jairo));
		return ResponseEntity.ok().body(list);
		
	}

}
