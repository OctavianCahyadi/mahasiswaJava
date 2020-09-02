package id.pantirapih.com.Service;

public enum StatusCode {
	DATANOTFOUND(100),
	DATADUPLICATE(102),
	PAGENOTFOUND(101),
	FULLQUOTA(103),
	NULLVALUE(400),
	GETOHERSERVICE(501),
	QUERYERROR(300),
	QUERYSELECT(301),
	QUERYINSERT(302),
	QUERYUPDATE(303),
	QUERYDELETE(304),
	
	JSONOBJ(1),
	JSONARR(2);
	
	private final int code;

	StatusCode(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}

}
