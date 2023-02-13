package com.ss.request;

import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.ss.constant.Message;

import lombok.Data;

@Data
public class ProjectRequest {
	private int projectId;
	@NotBlank(message = Message.projectNameNotBlanck)
	@NotNull(message = Message.projectNameNotNull)
	private String projectName;
	@NotBlank(message = Message.projectManagerNotBlanck)
	@NotNull(message = Message.projectManagerNotNull)
	private String projectManager;
	private List<Integer> userId;
}
