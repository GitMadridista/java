package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Working of functional interface : Predicate.
 * 
 * @author Shubham
 *
 */
class MyPredicate implements Predicate<Integer> {

	/**
	 * Find if number is odd or even
	 */
	@Override
	public boolean test(Integer num) {
		return num % 2 == 0;
	}
}

public class PredicateEx {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] { 2, 6, 3, 1, 999, 435 });
		List<Integer> evenList = list.stream().filter(new MyPredicate()).collect(Collectors.toList());
		System.out.println(evenList);

		/*
		 * Inline predicate
		 */
		Predicate<Integer> predicate = p -> p % 2 == 0;
		evenList = list.stream().filter(predicate).collect(Collectors.toList());
		System.out.println(evenList);
	}

}
