package bai3;

public class Main {

	public static void main(String[] args) {
		for(int i=0;i<7;i++) {
			System.out.printf("\t");
			for(int j=0;j<7;j++) {
				if(j==0||j==6||i==0||i==6||i==j||(i+j)==6) {
					System.out.printf("#");
				}
				else
				{
					System.out.printf(" ");
				}
			}
			System.out.println("");
		}

	}

}
