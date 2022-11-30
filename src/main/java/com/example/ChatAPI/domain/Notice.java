package com.example.ChatAPI.domain;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
public class Notice {

	@Getter @Setter
	private Integer id;
	@Getter @Setter
	private Integer contentFk;
	@Getter @Setter
	private Integer kind;
	@Getter @Setter
	private Boolean isRead;
	@Getter @Setter
	private Integer userFk;
	@Getter @Setter
	private Integer talkFk;
	@Getter
	private LocalDateTime createdTime;
	@Getter
	private LocalDateTime updatedTime;
	@Getter @Setter
	private Boolean deleted;

}
