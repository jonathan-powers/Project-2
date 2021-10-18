package com.revature.repositories;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.revature.CalCountApplication;
import com.revature.models.User;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CalCountApplication.class)
public class UserRepositoryTest {

	@Autowired
	private UserRepository userRepository;

	@BeforeClass
	public void setUp() {
		ArrayList<User> users = new ArrayList<User>();

		ArrayList<Integer> friends = new ArrayList<Integer>();

		friends.add(1);
		friends.add(2);

		users.add(new User(1, "name1", "email1", "password", 150, 50, friends));
		users.add(new User(2, "name2", "email2", "password", 150, 50, friends));
		users.add(new User(3, "name3", "email3", "password", 150, 50, friends));

		for (User user : users) {
			userRepository.save(user);
		}
	}

	@Before
	public void between_tests() {
		userRepository.deleteAll();

		ArrayList<User> users = new ArrayList<User>();

		ArrayList<Integer> friends = new ArrayList<Integer>();

		friends.add(1);
		friends.add(2);

		users.add(new User(1, "name1", "email1", "password", 150, 50, friends));
		users.add(new User(2, "name2", "email2", "password", 150, 50, friends));
		users.add(new User(3, "name3", "email3", "password", 150, 50, friends));

		for (User user : users) {
			userRepository.save(user);
		}
	}

	@Test
	public void should_create_new_users() {
		ArrayList<Integer> friends = new ArrayList<Integer>();

		friends.add(1);
		friends.add(2);

		User user = new User(4, "name4", "email4", "password", 150, 50, friends);

		userRepository.save(user);

		List<User> users = userRepository.findAll();

		Assert.assertEquals(4, users.size());
	}

	@Test
	public void should_find_all_users() {
		List<User> users = userRepository.findAll();

		Assert.assertEquals(3, users.size());
	}

	@Test
	public void should_find_user_id() {
		User user = userRepository.findById(1);

		ArrayList<Integer> friends = new ArrayList<Integer>();

		friends.add(1);
		friends.add(2);

		Assert.assertEquals(new User(1, "name1", "email1", "password", 150, 50, friends), user);
		;
	}
}
