package org.me.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest/users")
public class UserApi2 {
	
	@GetMapping
	public List<User> query() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 18; i++) {
			users.add(new User(String.valueOf(10000 + i), UUID.randomUUID().toString()));
		}
		System.out.println(users);
		return users;
	}
	
	@PostMapping
	public boolean add(User user) {
		System.out.println("ADD " + user);
		return true;
	}

}
