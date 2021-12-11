import java.util.Scanner;

public class Main {
	
	public static int bin2dec(long bin) {
		int dec=0,i=0;
		long remaind;
		while(bin!=0) {
			remaind=bin%10;
			if(remaind!=0 && remaind!=1)
				return -1;
			bin/=10;
			dec +=remaind*Math.pow(2, i);
			i++;
		}
		
		
		return dec;
		
	}
	public static void main(String[] args) {
		String bin;
		long l_bin;
		int dec;
		Scanner sc=new Scanner(System.in);
		bin=sc.nextLine();
		l_bin=Long.parseLong(bin);
		dec=bin2dec(l_bin);
		System.out.printf("Convert "+bin+" to Dec :"+dec);
		
	}

}
