package SubSystem;

public enum Status {
	OK(200) , REDIRECT(301) , NOTFOUND(404) , ERRORSERVER(500) ;
	
	private Status (int CODE) {}
	
}
