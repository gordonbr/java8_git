package john.lambdas;

import java.util.Arrays;
import java.util.List;

public class ListIterator2 {
	
	public static void main(String args[]){
		List<Integer> list = Arrays.asList(1,2,3);
		
		list.stream().map(f -> f + 1).forEach(System.out::println);
		
	}
}
