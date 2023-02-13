package com.ss.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ss.constant.Message;
import com.ss.entity.AddressBlock;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressRequest {
	private Integer addressId;
	@NotBlank(message = Message.cityNotBlanck)
	@NotNull(message = Message.cityNotNull)
	private String city;
	@NotBlank(message = Message.stateNotBlanck)
	@NotNull(message = Message.stateNotNull)
	private String state;
	@NotBlank(message = Message.zipCodeNotBlanck)
	@NotNull(message = Message.zipCodeNotNull)
	@Pattern(regexp = "\\d+", message = Message.onlyNumeric)
	private String zipCode;
	@NotBlank(message = Message.countryNotBlanck)
	@NotNull(message = Message.countryNotNull)
	private String country;
	private AddressBlock addressBlock;

}
