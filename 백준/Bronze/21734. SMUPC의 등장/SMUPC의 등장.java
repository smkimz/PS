import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] str = br.readLine().toCharArray();
		int ascii, sum;
		for (int i = 0; i < str.length; i++) {
			ascii = str[i];
			sum = 0;
			while (ascii > 0) {
				sum += ascii % 10;
				ascii /= 10;
			}
			while (--sum >= 0)
				sb.append(str[i]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}
