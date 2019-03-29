package jobbing;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		Scheduler scheduler = new Scheduler();
		Methods methods = new Methods();
		
//		scheduler.Job(2000);
		
		Method method1 = Methods.class.getMethod("Hello");
		Method method2 = Methods.class.getMethod("Sum");
		
		scheduler.methodCaller(methods, method1, 5000);
		scheduler.methodCaller(methods, method2, 1000);
		
		
	}

}
