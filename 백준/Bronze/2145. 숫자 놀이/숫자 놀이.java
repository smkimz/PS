import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N, ret;
		while (true) {
			N = Integer.parseInt(br.readLine());
			if (N == 0)
				break;
			ret = N;
			while (ret >= 10) {
				ret = 0;
				while (N > 0) {
					ret += N % 10;
					N /= 10;
				}
				N = ret;
			}
			sb.append(ret).append("\n");
		}
		System.out.print(sb);
	}
}