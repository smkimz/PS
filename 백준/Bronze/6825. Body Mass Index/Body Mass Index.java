import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] input = new double[2];
		for (int i = 0; i <= 1; i++)
			input[i] = Double.parseDouble(br.readLine());
		input[0] = input[0] / (Math.pow(input[1], 2));
		if (input[0] < 18.5)
			System.out.println("Underweight");
		else if (input[0] > 25.0)
			System.out.println("Overweight");
		else
			System.out.println("Normal weight");
	}
}
