package FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Working of functional interface : Function.
 * @author Shubham
 *
 */
class MyFunction implements Function<Integer, String> {

	@Override
	public String apply(Integer num) {
		if(num > 100)
			return "Number cannot exceed 100";
		return "Your score is: "+num;
	}
}

public class FunctionEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(new Integer[] {10,50,34, 99, 20,120});
		List<String> scoreList = list.stream().map(new MyFunction()).collect(Collectors.toList());
		System.out.println(scoreList);
		
		/*
		 * Or Define It Inline
		 */
		Function<Integer, String> function = f -> {
			if(f > 100)
				return "Number cannot exceed 100";
			return "Your score is: "+f;
		};
		
		scoreList = list.stream().map(function).collect(Collectors.toList());
		System.out.println(scoreList);
		
	}

}
