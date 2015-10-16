import java.util.Scanner;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class JSONProcessing
{
	public static void processJSON(String json) {
		try {
			Object obj=JSONValue.parse(json);
			JSONArray array=(JSONArray)obj;
			System.out.println("======the 2nd element of array======");
			System.out.println(array.get(1));
			System.out.println();

			JSONObject obj2=(JSONObject)array.get(1);
			System.out.println("======field \"1\"==========");
			System.out.println(obj2.get("1"));
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
