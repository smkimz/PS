import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		char[] str;
		String[] ret = new String[2];
		while (--T >= 0) {
			str = br.readLine().toCharArray();
			ret[0] = "";
			ret[1] = "";
			for (int i = 0; i < str.length; i++)
				ret[i % 2] += str[i];
			sb.append(ret[0]);
			if (str.length % 2 == 1)
				sb.append(ret[1]).append("\n").append(ret[1]).append(ret[0]);
			else
				sb.append("\n").append(ret[1]);
			sb.append("\n");
		}
		System.out.print(sb);
	}
}