package week2.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int firstNum=0,secNum=1,sum=0;
		for(int i=0;i<=11;i++) {
			sum = firstNum+secNum;
		    firstNum=secNum;
			secNum=sum;
			System.out.println(sum);
		}	
	}
}
