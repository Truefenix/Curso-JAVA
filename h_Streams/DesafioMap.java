package h_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<Object> print = System.out::print;
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		Function<Integer, String> nums2 = 
				n -> n == 6 ? "110" : "";
		Function<String, String> nums3 = 
				n -> n == "110" ? "011" : "";
		Function<String, Integer> nums4 = 
				n -> n == "011" ? 3 : 0;
				
		nums.stream()
				.map(nums2)
				.map(nums3)
				.map(nums4)
				.forEach(print);
				
	}
}
