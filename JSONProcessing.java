import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;


public class JSONProcessing
{
	public static void processJSON(String json) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
			String test = (String) jsonObject.get("statusupdate");
		}

	}

	public static void main(String[] argv) {
		Scanner in_scanner = new Scanner(System.in);

		while(in_scanner.hasNext()) {
			String json = in_scanner.nextLine();
			processJSON(json);
		}
	}
}
