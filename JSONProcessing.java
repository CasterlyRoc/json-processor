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
			Object obj = jsonParser.parse(json);
			JSONArray array = (JSONArray)obj;
			for(int i=0; i<array.size(); i++){
				System.out.println("The " + i + " element of the array: " + array.get(i));
			}

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
