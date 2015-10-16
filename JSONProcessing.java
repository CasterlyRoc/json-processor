import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONProcessing
{
	public static void processJSON(String json) {
		try {
			JSONParser jsonParser = new JSONParser();
			JSONObject jsonObject = (JSONObject) jsonParser.parse(json);
			Object obj = jsonObject.get("statusupdate");
			System.out.println(obj.toString());
		} catch (ParseException e){
			e.printStackTrace();
		}

	}

	public static void main(String[] argv) {
		Scanner in_scanner = new Scanner(System.in);


			String json = in_scanner.nextLine();
			processJSON(json);

	}
}
