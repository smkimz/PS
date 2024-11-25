import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		char[] X = new char[3];
		for (int i = 0; i < 3; i++)
			X[i] = st.nextToken().charAt(0);
		if (X[1] == X[2] && X[0] != X[1])
			System.out.println('A');
		else if (X[0] == X[2] && X[1] != X[2])
			System.out.println('B');
		else if (X[0] == X[1] && X[2] != X[0])
			System.out.println('C');
		else
			System.out.println('*');
	}
}