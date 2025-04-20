import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), j, ret = 0;
		char[] str = br.readLine().toCharArray();
		for (int i = 0; i < N / 2; i++) {
			j = N - i - 1;
			if (str[i] == str[j])
				continue;
			++ret;
			if (str[i] > str[j])
				str[i] = str[j];
			else
				str[j] = str[i];
		}
		sb.append(ret).append("\n").append(str);
		System.out.println(sb);
	}
}