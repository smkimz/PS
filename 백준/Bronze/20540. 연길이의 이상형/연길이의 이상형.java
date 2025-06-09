import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		char[] table = new char[128];
		table['E'] = 'I';
		table['I'] = 'E';
		table['S'] = 'N';
		table['N'] = 'S';
		table['T'] = 'F';
		table['F'] = 'T';
		table['J'] = 'P';
		table['P'] = 'J';
		char[] mbti = br.readLine().toCharArray();
		for (int i = 0; i < 4; i++)
			sb.append(table[mbti[i]]);
		System.out.print(sb);
	}
}