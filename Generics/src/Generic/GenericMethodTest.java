package Generic;

public class GenericMethodTest {

	public static <E> void printArray(E[] inputArray) {
		for(E element: inputArray) {
			System.out.println("%s " + element);
		}
	}
	
	public static void main(String args[]) {
		Integer[] intArray = {1,2,3,4,5,6};
		Double[] doubleArray = {1.1,2.1,3.3};
		Character[] charArray = {'F','d','t'};
		
		System.out.println("Print integerarray");
		printArray(intArray);
		System.out.println("Print doubleArray");
		printArray(doubleArray);
		System.out.println("Print character Array");
		printArray(charArray);
	}
}
