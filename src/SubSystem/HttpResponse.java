package SubSystem;

public class HttpResponse implements HTTP{
	private Status status;
	private String body;
	
	
	public  HttpResponse() {}
	
	
	public HttpResponse(Status status, String body) {
		super();
		this.status = status;
		this.body = body;
	}

	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
}
