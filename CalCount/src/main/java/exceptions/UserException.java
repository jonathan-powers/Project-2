package com.revature.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, 
reason="Sorry. We can't complete your request as it was sent.")
public class UserException extends RuntimeException{

}
