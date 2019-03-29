package jobbing;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Methods {

	public void Hello() {

		System.out.println("Hello, im here");
	}
	
	public void Sum() {
		//return a+b;
		System.out.println(4+6);
	}
	
	public Optional<String> Longest(String[] words) {
		
			Stream<String> stream1 = Arrays.stream(words);
			return stream1.max(Comparator.comparingInt(String::length));
	}
}
