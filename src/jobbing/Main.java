package jobbing;

import java.lang.reflect.Method;

public class Main {

	public static void main(String[] args) throws Exception {
		Scheduler scheduler = new Scheduler();
		Methods methods = new Methods();
		
		//scheduler.Job(2000);
		
		Method method1 = Methods.class.getMethod("Hello");
		
		scheduler.method2(methods, method1);
		
		
//		methods.Hello();
//		
//		String[] words = {"a", "AB", "ABC", "awefulAtThis", "GG"};
//		System.out.println("Longest = " + methods.Longest(words).get());
//		
//		int a = 5, b = 10;
//		System.out.println(a + " + " + b + " = " + methods.Sum(a, b));
	}

}
