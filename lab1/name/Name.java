import java.util.Scanner;

public class Name {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.print("fname: ");
		String fname = obj.nextLine();
		System.out.print("lname: ");
		String lname = obj.nextLine();
		System.out.println(lname + " " + fname);
		obj.close();
	}
}
