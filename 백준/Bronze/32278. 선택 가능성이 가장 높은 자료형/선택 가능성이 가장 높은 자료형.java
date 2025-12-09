import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long[] min = new long[] { Short.MIN_VALUE, Integer.MIN_VALUE, Long.MIN_VALUE },
				max = new long[] { Short.MAX_VALUE, Integer.MAX_VALUE, Long.MAX_VALUE };
		String[] dataType = new String[] { "short", "int", "long long" };
		long N = Long.parseLong(br.readLine());
		for (int i = 0; i < 3; i++) {
			if (N >= min[i] && N <= max[i]) {
				System.out.println(dataType[i]);
				return;
			}
		}
	}
}
