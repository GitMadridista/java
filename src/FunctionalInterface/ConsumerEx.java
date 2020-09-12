package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Working of functional interface : Consumer.
 * @author Shubham
 *
 */
class MyConsumer implements Consumer<String> {

	@Override
	public void accept(String str) {
		if (str.equalsIgnoreCase("Olives") 
				|| str.equalsIgnoreCase("Sausage") 
				|| str.equalsIgnoreCase("Tomato") 
				|| str.equalsIgnoreCase("Pepperoni")) {
			System.out.println(str+" added");
		} else {
			System.out.println("We dont have "+str+" right now or maybe it doesn't belong on a Pizza.");
		}
	}

}

public class ConsumerEx {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(new String[] {"Olives", "Pinapple", "Sausage", "Tomato", "TeddyBear"});
		list.stream().forEach(new MyConsumer());
		
		/*
		 * OR Define it inline
		 */
		
		Consumer<String> myConsumer = c -> {
			if (c.equalsIgnoreCase("Olives") 
					|| c.equalsIgnoreCase("Sausage") 
					|| c.equalsIgnoreCase("Tomato") 
					|| c.equalsIgnoreCase("Pepperoni")) {
				System.out.println(c+" added");
			} else {
				System.out.println("We dont have "+c+" right now or maybe it doesn't belong on a Pizza.");
			}
		};
		list.stream().forEach(myConsumer);
		
	}
}
