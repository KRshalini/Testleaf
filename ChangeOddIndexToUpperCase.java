package Assignments;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test = "changeme";
		int count=0;
		String k= "";
		char[] a = test.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(i%2!=0) {
				count++;
				k=k+a[i];
				//System.out.println(test.toUpperCase());
			}
		}
		//System.out.println(count);
		System.out.println(k.toUpperCase());
	}

}
