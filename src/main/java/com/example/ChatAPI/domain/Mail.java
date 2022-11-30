package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Mail {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String address;
	@Getter @Setter
	private String token;
	@Getter
	private LocalDateTime createdTime;
	@Getter @Setter
	private Boolean deleted;

}
