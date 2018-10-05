package Generic;

public class GenericClassTest<T> {
	private T t;
	
	public void add(T t){
		this.t = t;
	}
	
	public T get() {
		return t;
	}
	
	public static void main(String[] args) {
		GenericClassTest<Integer> integerBox = new GenericClassTest<Integer>();
		GenericClassTest<String> stringBox = new GenericClassTest<String>();
		integerBox.add(new Integer(10));
		stringBox.add(new String("Hello Generic class"));
		System.out.println("Integer Value "+integerBox.get());
		System.out.println("String Value "+stringBox.get());
	}
}
