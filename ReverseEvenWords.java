package Assignments;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String[] s = test.split(" ");
		//char[] c = test.toCharArray();
		//String n ="";
		//System.out.println(Arrays.toString(s));
		
		for(int i=0;i<s.length;i++) {
			if(i%2!=0) {
				char[] c = s[i].toCharArray();
				for(int j=c.length-1;j>=0;j--) {
					//n=n+c[i];
					System.out.print(c[j]);
				}
			}
			else{
					System.out.println(s[i]);
				}
				System.out.print("");
			}
		}
	
	

}
