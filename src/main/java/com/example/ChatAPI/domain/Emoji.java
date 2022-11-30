package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

public class Emoji {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String path;
	@Getter
	private LocalDateTime createdTime;
	@Getter @Setter
	private Boolean deleted;

}
