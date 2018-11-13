package _04.genericClass;

public class GenericTypes {

	public static void main(String[] args) {
		GenericTypeTest<Integer> genericInteger = new GenericTypeTest<Integer>(10);
		GenericTypeTest<String> genericString = new GenericTypeTest<String>("string");

		//
		System.out.println(genericInteger.getGenericReference());
		System.out.println(genericString.getGenericReference());

	}
}

class GenericTypeTest<T> {
	private T genericReference;

	public T getGenericReference() {
		return genericReference;
	}

	public void setGenericReference(T genericReference) {
		this.genericReference = genericReference;
	}

	public GenericTypeTest(T genericReference) {
		super();
		this.genericReference = genericReference;
	}

}
