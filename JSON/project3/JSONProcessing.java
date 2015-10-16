import org.json.JSONArray;
import org.json.JSONObject;
import org.json.parser.JSONParser;
import org.json.parser.ParseException;

import java.util.Scanner;


public class JSONProcessing 
{
	public static void processJSON(String json) {

		
	}

	public static void main(String[] argv) {
		Scanner in_scanner = new Scanner(System.in);

		while(in_scanner.hasNext()) {
			String json = in_scanner.nextLine();
			processJSON(json);
		}
	}
}
