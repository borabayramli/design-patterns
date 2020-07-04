package optionalF;

import java.util.Optional;

public class MainApp {

	public static void main(String[] args) {
		
		Integer say = null;
		if (say != null) {
			
		}
		
		
		// optional control
		Optional<Integer> op1 = Optional.ofNullable(say);
		op1.ifPresent( item -> {
			// kesinlikle say değeri var
			System.out.println("Integer Val : " + item);
		});
		
		
		// default val
		Integer val = op1.orElse(20);
		System.out.println("Default int val : " + val);
		
		
		Integer num = null;
		Optional<Integer> op2 = Optional.ofNullable(num);
		int end = op2.orElseThrow(RuntimeException::new);
		System.err.println("Error: " + end);
		
		
	}

}
