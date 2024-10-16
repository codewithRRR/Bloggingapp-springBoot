package com.example.demo.users;

import lombok.Data;
import lombok.Setter;

@Data
@Setter
public class UserBuilder {
	private Long id;
	private String username;
	private String email;
	private String bio;
	private String image;

}
