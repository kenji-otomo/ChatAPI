package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Status {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;
	
	@Getter @Setter
	private Integer value;

}
