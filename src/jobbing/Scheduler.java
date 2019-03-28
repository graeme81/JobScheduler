package jobbing;

import java.lang.reflect.Method;

public class Scheduler {
	
	public Scheduler() {
		
	}
	
//	public void Job(int n)  {
//		System.out.println("Tired");
//		
//		try {
//			Thread.sleep(n);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		System.out.println("AWoKEN!");
//	}
	
	
	public void method2(Object object, Method method) throws Exception {
        
        method.invoke(object);
    }

}
