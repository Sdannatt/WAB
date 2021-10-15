package com.qa.wab.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "No unit with that id has been found")
public class WabNotFoundException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4203345612619258376L;

}
