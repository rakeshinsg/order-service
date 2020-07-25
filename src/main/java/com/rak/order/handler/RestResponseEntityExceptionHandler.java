package com.rak.order.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.rak.order.exception.ConnectionException;
import com.rak.order.exception.OrderNotFoundException;

@RestControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ExceptionHandler(OrderNotFoundException.class)
	public final ResponseEntity<Object> handleConflict(Exception ex, WebRequest request) {
		return new ResponseEntity(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@ExceptionHandler(ConnectionException.class)
	public final ResponseEntity<Object> handleConnection(Exception ex, WebRequest request) {
		return new ResponseEntity(ex.getMessage(), HttpStatus.CONFLICT);
	}
}