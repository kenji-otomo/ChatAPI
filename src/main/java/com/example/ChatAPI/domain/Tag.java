package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Tag {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter
	private LocalDateTime createdTime;
	@Getter @Setter
	private Boolean deleted;

}
