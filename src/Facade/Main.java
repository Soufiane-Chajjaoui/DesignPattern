package Facade;

import SubSystem.HttpRequest;
import SubSystem.HttpResponse;
import SubSystem.MethodHttp;
import SubSystem.Status;

public class Main {
	
	public static void main(String[] args) {
		Route f = new Route.builderRoute()
				.sethttpRequest(new HttpRequest(MethodHttp.GET, "/users"))
				.build();
		Route f1 = new Route.builderRoute().sethttpResponse(new HttpResponse(Status.OK , "Nadi")).build();
		
	}
}
