import java.util.Scanner;

public class Exercise4 {
	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		int i = scan.nextInt();
		scan.nextLine();
		double d = scan.nextDouble();

		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}
}

