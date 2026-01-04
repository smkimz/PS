import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] keyNums = new int[128];
		char[][] keys = new char[5][];
		char[] crashKeys = new char[9];
		int midKey = 0;
		for (int i = 0; i < 4; i++) {
			keys[i] = br.readLine().toCharArray();
			for (int j = 0; j < 10; j++)
				keyNums[keys[i][j]] = i * 10 + j;
		}
		crashKeys = br.readLine().toCharArray();
		for (int i = 0; i < 9; i++)
			midKey += keyNums[crashKeys[i]];
		midKey /= 9;
		for (int i = 0; i < 9; i++) {
			if (keyNums[crashKeys[i]] == midKey) {
				System.out.println(crashKeys[i]);
				return;
			}
		}
	}
}
