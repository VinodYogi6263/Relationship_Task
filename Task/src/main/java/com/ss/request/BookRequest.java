package com.ss.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ss.constant.Message;

import lombok.Data;

@Data
public class BookRequest {

	private int bookId;
	@NotBlank(message = Message.bookNameNotBlanck)
	@NotNull(message = Message.bookNameNotNull)
	private String bookName;
	@NotBlank(message = Message.priceNotBlanck)
	@NotNull(message = Message.priceNotNull)
	@Pattern(regexp = "\\d+", message = Message.onlyNumeric)
	private String price;
	@NotBlank(message = Message.userIdNotBlanck)
	@NotNull(message = Message.userIdNotNull)
	@Pattern(regexp = "\\d+", message = Message.onlyNumeric)
	private String userId;

}
