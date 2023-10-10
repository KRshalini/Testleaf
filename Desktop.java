package org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("The desktop size is 50");
	}
	public static void main(String[] args) {
		Desktop org  = new Desktop();
		org.desktopSize();
		org.computerModel();
	}

}
