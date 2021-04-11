package sample.core.annotations;

@Service(name = "Super-LazyService")
public class LazyService {
	@Init
	void  lazyInit() throws Exception {
		System.out.println("lasyInit");
	}

}
