import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String[] f = new String['t' + 1];
		f['a'] = "Panthera tigris\n";
		f['t'] = "Pinus densiflora\n";
		f['f'] = "Forsythia koreana\n";
		char i;
		while (true) {
			i = br.readLine().charAt(0);
			if (i == 'e')
				break;
			sb.append(f[i]);
		}
		System.out.print(sb);
	}
}
