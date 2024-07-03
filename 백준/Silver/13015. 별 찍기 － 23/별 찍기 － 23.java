import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] strs = new String[3];
		String temp = "";
		strs[0] = "";
		temp = "*";
		for (int i = 1; i < N; i++)
			temp += "*";
		strs[0] += temp;
		for (int i = 0; i < N * 2 - 3; i++)
			strs[0] += " ";
		strs[0] += temp;
		strs[1] = "*";
		for (int i = 0; i < N - 2; i++)
			strs[1] += " ";
		strs[1] += "*";
		strs[2] = " ";
		for (int i = 1; i < N - 1; i++)
			strs[2] += " ";
		strs[2] += "*";
		temp = "";
		for (int i = 0; i < N - 2; i++)
			temp += " ";
		strs[2] += temp + "*" + temp + "*";
		sb.append(strs[0]).append("\n");
		for (int i = 1; i <= N - 2; i++) {
			temp = "";
			for (int j = 1; j <= i; j++)
				temp += " ";
			sb.append(temp).append(strs[1]);
			temp = "";
			for (int j = (N * 2) - (i * 2) - 3; j >= 1; j--)
				temp += " ";
			sb.append(temp).append(strs[1]).append("\n");
		}
		sb.append(strs[2]).append("\n");
		for (int i = N - 2; i >= 1; i--) {
			temp = "";
			for (int j = 1; j <= i; j++)
				temp += " ";
			sb.append(temp).append(strs[1]);
			temp = "";
			for (int j = (N * 2) - (i * 2) - 3; j >= 1; j--)
				temp += " ";
			sb.append(temp).append(strs[1]).append("\n");
		}
		sb.append(strs[0]);
		System.out.print(sb);
	}
}