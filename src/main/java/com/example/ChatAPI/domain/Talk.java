package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Talk {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String content;
	@Getter @Setter
	private String photoPath;
	@Getter @Setter
	private Integer kind;
	@Getter @Setter
	private Integer userFk;
	@Getter @Setter
	private Integer roomFk;
	@Getter @Setter
	private Integer characterFk;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;

}
