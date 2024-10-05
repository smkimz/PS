import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		double copyCount = Math.log(N) / Math.log(2);
		if (copyCount % 1 == 0.0)
			System.out.println(10 + (int) copyCount);
		else
			System.out.println(9 + (int) Math.ceil(copyCount));
	}
}