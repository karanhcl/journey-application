package com.book.journey.manager.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.book.journey.manager.api.ResponseTO;
import com.book.journey.manager.common.CustomerNotFound;

/**
 * 
 * Controller advice for exception handling.
 *
 * @author karansingh
 * @version $Revision: 0.1 $
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler 
  extends ResponseEntityExceptionHandler {
 
    @ExceptionHandler(value 
      = { CustomerNotFound.class})
    protected ResponseEntity<Object> handleConflict(
      RuntimeException ex, WebRequest request) {
        ResponseTO responseTO = new ResponseTO();
        return new ResponseEntity<>(responseTO, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}