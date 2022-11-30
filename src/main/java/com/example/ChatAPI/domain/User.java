package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class User {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String email;
	@Getter @Setter
	private String password;
	@Getter @Setter
	private String iconPhotoPath;
	@Getter @Setter
	private String headerPhotoPath;
	@Getter @Setter
	private String introduction;
	@Getter
	private LocalDateTime loginedTime;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	};
	
	public void setHashPassword(String password) {
		this.password = passwordEncoder().encode(password);
	}
}
