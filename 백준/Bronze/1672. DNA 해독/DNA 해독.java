import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[][] table = { { 'A', 'C', 'A', 'G' }, { 'C', 'G', 'T', 'A' }, { 'A', 'T', 'C', 'G' },
				{ 'G', 'A', 'G', 'T' } };
		int[] number = new int['U'];
		number['A'] = 0;
		number['G'] = 1;
		number['C'] = 2;
		number['T'] = 3;
		int N = Integer.parseInt(br.readLine());
		char[] dna = br.readLine().toCharArray();
		for (int i = N - 2; i >= 0; i--)
			dna[i] = table[number[dna[i]]][number[dna[i + 1]]];
		System.out.print(dna[0]);
	}
}