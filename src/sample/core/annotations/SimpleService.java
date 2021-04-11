package sample.core.annotations;



@Service(name = "Super-SimpleService", lazyLoad = true)
public class SimpleService  {
	
	@Init
	void initService() {
		System.out.println("initService");
	}
	
	public static void main(String[] args) {
	System.out.println("main");
	}
}


 