import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<String, Double> supplies = new HashMap<>();
		supplies.put("Paper", 57.99);
		supplies.put("Printer", 120.50);
		supplies.put("Planners", 31.25);
		supplies.put("Binders", 22.50);
		supplies.put("Calendar", 10.95);
		supplies.put("Notebooks", 11.20);
		supplies.put("Ink", 66.95);
		double ret = 0;
		String supply;
		while (true) {
			supply = br.readLine();
			if (supply.equals("EOI"))
				break;
			ret += supplies.get(supply);
		}
		System.out.printf("$%.2f", ret);
	}
}