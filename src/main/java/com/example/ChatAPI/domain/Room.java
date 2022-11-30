package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Room {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private Boolean isDm;
	@Getter @Setter
	private String photoPath;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;
}
