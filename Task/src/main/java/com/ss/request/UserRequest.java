package com.ss.request;

import java.util.List;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ss.constant.Message;

import lombok.Data;

@Data
public class UserRequest {
	private int userId;
	@NotBlank(message = Message.usernameNotBlanck)
	@NotNull(message = Message.usernameNotNull)
	private String userName;
	@NotBlank(message = Message.emailNotBlanck)
	@NotNull(message = Message.emailNotNull)
	@Email(message = Message.invalidEmail)
	private String userEmail;
	@NotBlank(message = Message.userPasswordNotBlanck)
	@NotNull(message = Message.userPasswordNotNull)
	@Pattern(regexp = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}", message = Message.password)
	private String userPassword;
	@NotBlank(message = Message.userstatusNotBlanck)
	@NotNull(message = Message.userstatusNotNull)
	private String userStauts;

	@NotNull(message = Message.projectIdNotNull)
	@NotEmpty(message = Message.projectIdNotEmpty)
	private List<Integer> projectId;

	@NotNull(message = Message.bookIdNotNull)
	@NotEmpty(message = Message.bookIdNotEmpty)
	private List<Integer> bookId;
}
