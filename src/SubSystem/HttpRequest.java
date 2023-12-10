package SubSystem;

public class HttpRequest implements HTTP {
	
	private MethodHttp method ;
	private String resource ;
	
	
	
	public HttpRequest(MethodHttp m , String r) {
		this.setMethodHttp(m) ;
		this.setResource(r);
	}

	public MethodHttp getMethod() {
		return method;
	}

	public void setMethodHttp(MethodHttp method) {
		this.method = method;
	}

	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}
	

}
