package com.example.loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.loan.Model.UserModel;
import com.example.loan.Service.UserModelService;

@RestController
	@RequestMapping("/user")
	public class UserController {
		@Autowired
		UserModelService userSer;
	
		
		@PostMapping("/signup")
		public UserModel addDetails(@RequestBody UserModel u)
		{
			return userSer.saveUser(u);
		}
		@GetMapping(value="/getProfile")
		public List<UserModel> get()
		{
			List<UserModel> s=userSer.get();
			return s;
		}
		
			@PutMapping("/update")
			public UserModel updateUser(@RequestBody UserModel id)
			{
				return userSer.updateInfo(id);
			}
			@DeleteMapping("/deleteById/{id}")
			public String deleteUser(@PathVariable("id") int id)
			{
				userSer.deleteInfo(id);
				return " user details deleted";
			
		}
			
}

	

