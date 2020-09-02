package id.pantirapih.com.Exception;

public class ExceptionResponse {
 	private Integer errorCode;
    private String errorMessage;
    private String errorCause;
    
    public ExceptionResponse() {
    }

    public Integer getErrorCode() {
        return errorCode;
    }

	public String getErrorCause() {
		return errorCause;
	}

	public void setErrorCause(String errorCause) {
		this.errorCause = errorCause;
	}

	public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String Message) {
        this.errorMessage = Message;
    }
}
