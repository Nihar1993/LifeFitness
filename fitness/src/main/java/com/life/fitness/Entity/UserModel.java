package com.life.fitness.Entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
public class UserModel implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String fullName;
	private String email;
	private String role;
	private Cart cart;



}
