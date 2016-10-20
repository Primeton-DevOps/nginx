package org.me.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/users")
public class UserApi {
	
	@GetMapping
	public List<User> query() {
		List<User> users = new ArrayList<User>();
		for (int i = 0; i < 18; i++) {
			users.add(new User(String.valueOf(10000 + i), new Date().toString()));
		}
		System.out.println(users);
		return users;
	}
	
	@PostMapping
	public boolean add(@RequestBody User user) {
		System.out.println("ADD " + user);
		return true;
	}

}
