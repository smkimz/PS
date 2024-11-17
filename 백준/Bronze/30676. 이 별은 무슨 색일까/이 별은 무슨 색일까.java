import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int l = Integer.parseInt(br.readLine());
		if (l >= 620 && l <= 780)
			System.out.println("Red");
		else if (l >= 590 && l < 620)
			System.out.println("Orange");
		else if (l >= 570 && l < 590)
			System.out.println("Yellow");
		else if (l >= 495 && l < 570)
			System.out.println("Green");
		else if (l >= 450 && l < 495)
			System.out.println("Blue");
		else if (l >= 425 && l < 450)
			System.out.println("Indigo");
		else if (l >= 380 && l < 425)
			System.out.println("Violet");
	}
}