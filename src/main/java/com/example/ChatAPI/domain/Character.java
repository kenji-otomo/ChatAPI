package com.example.ChatAPI.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Character {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private String name;
	@Getter @Setter
	private String introduction;
	@Getter @Setter
	private Integer userFk;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;

	@Getter @Setter
	private List<Status> statusList;
	@Getter @Setter
	private List<Skill> skillList;
	
}
