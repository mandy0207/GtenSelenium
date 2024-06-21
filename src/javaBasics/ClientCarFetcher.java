package javaBasics;

public class ClientCarFetcher {

	
	public static void main(String[] args) {
		
		Car car1 = new Car("Mustang", "50000", "2022");
		Car car2 = new Car("Dodge", "1000000", "2024");

		car1.kuchBhi();
		System.out.println(car1.getName());
		System.out.println(car2.getName());
		
	}

}
