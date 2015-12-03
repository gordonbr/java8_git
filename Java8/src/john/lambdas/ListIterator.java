package john.lambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListIterator {
	
	
	public static void main(String[] args) {
		final List<String> names = Arrays.asList("John", "Michely", "Caio", "Bia");
		
		
		names.forEach(name -> System.out.println(name + " casa"));
		
		//names.stream().map(name -> name.toUpperCase()).forEach(ListIterator::printT);
		
		List<Long> longCount = new ArrayList<>(); 
		//Stream
		long begin = System.currentTimeMillis();
		longCount = names.stream().map(name -> countN(name)).collect(Collectors.toList());
		System.out.println(String.format("\n%d", System.currentTimeMillis() - begin));
		
		longCount.forEach(System.out::print);
		
		//Loop
		List<Long> longCount2 = new ArrayList<>();
		begin = System.currentTimeMillis();
		for (String name : names)
			longCount2.add(countN(name));
		
		System.out.println(String.format("\n%d", System.currentTimeMillis() - begin));
		longCount2.forEach(System.out::print);
		
	}
	
	public static void printT(String name){
		System.out.println(name + " ugly");
	}
	
	public static Long countN(String name){
		long a = 0;
		for (int i = 0; i < 10000; i++)
			for (int j = 0; j < 10000; j++){
				a += factorial(1000l);
			}
		
		return a;
	}
	
	public static long factorial(long n){
		long result = 1;
		
		while(n-- > 1)
			result *= n;
		
		return result;
	}

}
