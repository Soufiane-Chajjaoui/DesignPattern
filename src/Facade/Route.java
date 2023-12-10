package Facade;

 
import SubSystem.HttpRequest;
import SubSystem.HttpResponse;
import SubSystem.MethodHttp;
import SubSystem.Status;

public class Route {
	
	private final HttpRequest httpRequest;
	private final HttpResponse httpResponse;
	
	
	private Route(HttpRequest httpRequest, HttpResponse httpResponse) {
		super();
		this.httpRequest = httpRequest;
		this.httpResponse = httpResponse;
	}
	

	public static class builderRoute{
		
		private HttpRequest httpRequest ;
		private HttpResponse httpResponse;

		public builderRoute sethttpRequest(HttpRequest request) {
			this.httpRequest = request ;
			return this ;
		}
		
		public builderRoute sethttpResponse(HttpResponse response) {
			this.httpResponse = response ;
			return this ;
		}
		
		public Route build() {
			return new Route(new HttpRequest(this.httpRequest.getMethod(), this.httpRequest.getResource()) 
					, new HttpResponse(this.httpResponse.getStatus() , this.httpResponse.getBody()));
		}
	}
	
	
	
	
	
	
}
