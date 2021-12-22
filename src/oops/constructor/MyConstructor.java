package oops.constructor;

class vehicle {
	int wheels;

	vehicle() {
		wheels = 4;
	}
}

public class MyConstructor {
	MyConstructor() {
		System.out.println("New object created");
	}

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MyConstructor obj = new MyConstructor();
		vehicle car = new vehicle();
		vehicle car2 = new vehicle();
		System.out.println(car.wheels + " Wheels");
		System.out.println(car2.wheels + " Wheels");

	}

}
