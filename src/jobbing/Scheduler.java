package jobbing;

import java.lang.reflect.Method;

public class Scheduler {
	
	public Scheduler() {
		
	}
	
	public void Job(int n)  {
		System.out.println("Tired");
		
		try {
			Thread.sleep(n);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("AWoKEN!");
	}
	
	
	public void methodCaller(Object object, Method method, int time) throws Exception {
		System.out.println("waiting ...");
		try {
			Thread.sleep(time);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
        method.invoke(object);
    }

}
