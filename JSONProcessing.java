import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class JSONProcessing
{
	public static void processJSON(String json) {
		JSONParser jsonParser = new JSONParser();

	}

	public static void main(String[] argv) {
		Scanner in_scanner = new Scanner(System.in);

		while(in_scanner.hasNext()) {
			String json = in_scanner.nextLine();
			processJSON(json);
		}
	}
}
