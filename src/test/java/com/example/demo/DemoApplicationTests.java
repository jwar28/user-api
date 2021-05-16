package com.example.demo;

import com.example.demo.models.User;
import com.example.demo.services.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	UserService userService = new UserService();
	@Test
	void saveUserTest() {
		User user = new User("Jwar28", "andrescalvo");
		userService.saveUser(user);
	}

}
