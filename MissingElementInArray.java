package Assignments;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
		//first method
		int[] num = {1,2,3,4,7,6,8};
		int sum1 = 0;
		for(int i=0;i<=8;i++) {
			sum1 = sum1+i;
		}
		//System.out.println(sum1);
		int sum2 = 0;
		for (int i = 0; i < num.length; i++) {
			sum2 = sum2+num[i];
		}
		//System.out.println(sum2);
		int sum3=sum1-sum2;
		System.out.println("First Method: "+sum3);
	
//second method

int[] arr = {1,2,3,4,6,7};
Arrays.sort(arr);
for(int j=0;j<arr.length;j++) {
	if(arr[j]!=j+1) {
		System.out.println("Second Method: "+(j+1));
		break;
	}
}
//Third method
int[] a = {1,2,3,4,7,6,8};
int n = a.length+1;
int s = n*(n+1)/2;  //36
for(int k=0;k<a.length;k++) {
	s = s-a[k];
	//System.out.println(s);
}
System.out.println("Third Method: "+s);
	}
}
