package Generic;

public class MaximumGenericTest {
	public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
		T max = x;
		if(y.compareTo(max)>0) {
			max = y;
		}
		if(z.compareTo(max)>0) {
			max = z;
		}
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println(maximum(45, 59, 11));
		System.out.println(maximum(4.5, .59, 1.1));
		System.out.println(maximum("Hari","Om","Ta"));
	}
}
