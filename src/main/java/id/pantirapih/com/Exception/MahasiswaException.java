package id.pantirapih.com.Exception;

import java.util.Arrays;
import java.util.List;

public class MahasiswaException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private Integer errorCode;
	private List<String> errorMessage;
	 
	    public MahasiswaException(String errorCause, List<String> errorMessage, Integer errorCode) {
	        super(errorCause);
	        this.errorCode = errorCode;
	        this.errorMessage = errorMessage;
	    }
	    
	    public MahasiswaException(String errorCause, String errorMessage, Integer errorCode) {
	        super(errorCause);
	        this.errorCode = errorCode;
	        this.errorMessage = Arrays.asList(errorMessage);
	    }
	    
	    public Integer getErrorCode() {
			return errorCode;
		}

		public List<String> getErrorMessage() {
			return errorMessage;
		}
	    

}
