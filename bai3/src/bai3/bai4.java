package bai3;

public class bai4 {

	public static void main(String[] args) {
		int n=20;
		long factorial=1;
		int i=1;
		while(i<=n) {
			factorial=factorial*i;
			i++;
		}
		System.out.println("The Factorial of "+n+" is "+factorial);

	}

}
