package com.ss.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ss.constant.Message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaginationRequest {
	@NotBlank(message = Message.pageNumberNotBlanck)
	@NotNull(message = Message.pageNumberNotNull)
	@Pattern(regexp = "\\d+", message = Message.onlyNumeric)
	private String pageNumber;
	@NotBlank(message = Message.pageSizeNotBlanck)
	@NotNull(message = Message.pageSizeNotNull)
	@Pattern(regexp = "\\d+", message = Message.onlyNumeric)
	private String pageSize;
	@NotBlank(message = Message.sortByNotBlanck)
	@NotNull(message = Message.sortByNotNull)
	private String sortBy;
	private String search;

}
