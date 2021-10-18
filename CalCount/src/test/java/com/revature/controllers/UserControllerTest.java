package com.revature.controllers;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.revature.models.User;
import com.revature.services.UserService;

@ContextConfiguration(locations = "classpath:testApplicationContext.xml")

@WebAppConfiguration
@RunWith(SpringRunner.class)
public class UserControllerTest {
	
	@Mock
	public UserService userService;
	
	@InjectMocks
	public UserController userController;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		MockitoAnnotations.openMocks(this);
		
		mockMvc = MockMvcBuilders.standaloneSetup(userController).build();
	}
	
	@Test
	public void testGetAllUsersEndpoint() {
		Mockito.when(userService.findAllUsers()).thenReturn(new ArrayList<User>());
		
		List<User> users = userController.getAllUsers();
		
		Assert.assertEquals(new ArrayList<User>(), users);
	}

}
