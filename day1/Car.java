package week1.day1;

public class Car {
	
	 public void applyGear() {
		 System.out.println("Apply Gear");
	 }
	 public void switchOnAC() {
		 System.out.println("Switch On AC");
	 }
	 public void applyAccelerate() {
		 System.out.println("Apply Accelerate");
	 }
	 public static void main(String[] args) {
		 Car bmw = new Car();
		 bmw.applyGear();
		 bmw.switchOnAC();
		 bmw.applyAccelerate();
	 }

}
