import java.util.*;

public class Stringreverse {
	public static void main(String[] args) {

		String original, reverse = " ";

		Scanner s = new Scanner(System.in);
		original = s.nextLine();
		int len = original.length();

		for (int i = len - 1; i > 0; i--)

			reverse = reverse + original.charAt(i);
		System.out.println("Hello World" + reverse);
	}
}
