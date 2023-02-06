package week1.day2;

public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car obj = new Car();
		
		int registrationNumber = obj.registrationNumber();
		System.out.println(registrationNumber);
		
		String carOwnerName = obj.getCarOwnerName();
		System.out.println(carOwnerName);
		
		obj.carModel();
		
		boolean punctured = obj.isPunctured();
		System.out.println(punctured);
		
		
		int subtraction = obj.subtraction(10,5);
		System.out.println(subtraction);
		
		int multiplication = obj.multiplication(5, 6, 7);
		System.out.println(multiplication);

		float division = obj.division(21, 2);
		System.out.println(division);
	}

	public int registrationNumber()

	{
		int registernumber = 4554;
		return registernumber;
	}

	private String getCarOwnerName() {
		String nameOfOwner = "Jagadeesh";
		return nameOfOwner;
	}

	void carModel() {
		String modelname = "Swift";
		System.out.println(modelname);
	}

	public boolean isPunctured() {
		boolean punctured = true;
		return punctured;
	}

	public int subtraction(int num1, int num2) {
		return num1 - num2;

	}

	public int multiplication(int num1, int num2) {
		return num1 * num2;

	}

	public int multiplication(int num1, int num2, int num3) {
		return num1 * num2 * num3;

	}

	public float division(float num1, float num2) {
		return num1 / num2;

	}
}
