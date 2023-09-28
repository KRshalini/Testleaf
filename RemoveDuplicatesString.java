package Assignments;

public class RemoveDuplicatesString {
	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count = 0;
		String[] split = text.split(" ");
		for(int i=0;i<split.length;i++) {
			for(int j=i+1;j<split.length;j++) {
				if(split[i].equals(split[j])) {
					count++;
					//System.out.println(count);
			}
			}
		}
		System.out.println(count);
		if(count>1) {
			System.out.println(text.replaceAll("java", ""));
		}else {
			System.out.println(text);
		}
	}

}
