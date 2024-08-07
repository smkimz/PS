import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		char[] str = br.readLine().toCharArray();
		int[] count = new int[2];
		for (int i = 0; i < N; i++)
			++count[str[i] - 'A'];
		if (count[0] > count[1])
			System.out.println("A");
		else if (count[0] < count[1])
			System.out.println("B");
		else
			System.out.println("Tie");
	}
}