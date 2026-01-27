import java.util.Scanner;

public class Week {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("week no: ");
		int weekNo = obj.nextInt();
		switch (weekNo) {
			case 1:
				System.out.println("mon");
				break;
			case 2:
				System.out.println("tues");
				break;
			case 3:
				System.out.println("wed");
				break;
			case 4:
				System.out.println("thurs");
				break;
			case 5:
				System.out.println("fri");
				break;
			case 6:
				System.out.println("sat");
				break;
			case 7:
				System.out.println("sun");
				break;
			default:
				System.out.println("wrong ");
		}
		obj.close();
	}
}
