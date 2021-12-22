package oops.constructor;

class vehicl {

	int Wheels;
	int headLights;

	vehicl(int noOfWheels) {
		Wheels = noOfWheels;
		headLights = 2;
	}

}

public class parameterConstructor {

	public static void main(String[] args) {
		vehicl car = new vehicl(4);
		vehicl scooty = new vehicl(2);
		System.out.println(car.Wheels + " wheels");
		System.out.println(scooty.Wheels + " wheels");
		System.out.println(car.headLights + " head lights");
	}

}
