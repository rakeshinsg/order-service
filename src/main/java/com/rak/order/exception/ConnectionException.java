package com.rak.order.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(HttpStatus.CONFLICT)
public class ConnectionException extends RuntimeException {

	public ConnectionException(String message) {
		super(message);
	}
}
