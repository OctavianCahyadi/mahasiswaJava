package id.pantirapih.com.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class ExceptionHandlingController {
	
	@ExceptionHandler(MahasiswaException.class)
    public ResponseEntity<ExceptionResponse> resourceNotFound(MahasiswaException ex) {
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode(ex.getErrorCode());
        if(ex.getErrorMessage() != null) {
        	String messsage = String.join(",", ex.getErrorMessage());
        	response.setErrorMessage(messsage);
        }
        response.setErrorCause(ex.getMessage());
        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.OK);
    }
	
	@ExceptionHandler(NoHandlerFoundException.class)	
	public ResponseEntity<ExceptionResponse> noHandlerFoundException(Exception ex) {
		ExceptionResponse response = new ExceptionResponse();
		return new ResponseEntity<ExceptionResponse>(response, HttpStatus.OK);
	}


}
