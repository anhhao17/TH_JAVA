import java.util.*;

public class DoW {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String day;
		System.out.println("Nhap ngay trong tuan 5-11/12/2021");
		day=sc.nextLine();
		switch (day) {
		case "5":
			System.out.println("Thu 2");
			break;
		case "6":
			System.out.println("Thu 3");
			break;
		case "7":
			System.out.println("Thu 4");
			break;
		case "8":
			System.out.println("Thu 5");
			break;
		case "9":
			System.out.println("Thu 6");
			break;
		case "10":
			System.out.println("Thu 7");
			break;
		case "11":
			System.out.println("Chu Nhat");
			break;
		default:
			System.out.println("Vui Long Nhap Dung!!!");
			break;
		}
	}

}
