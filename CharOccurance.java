package Assignments;

public class CharOccurance {
	public static void main(String[] args) {
		String str = "welcome to chennai";
		char[] charArray = str.toCharArray();
		int count=0;
		for(int i=0;i<charArray.length;i++) {
			if(charArray[i]=='e') {
				count++;
			}
		}
		System.out.println("The count of e: "+count);
	}

}
