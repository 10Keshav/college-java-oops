import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		obj.close();
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			rev = (rev * 10) + (temp % 10);
			temp = temp / 10;
		}
		if (rev == num)
			System.out.println(num + " is a palindrome");
		else
			System.out.println(num + " is not a palindrome");
	}
}
