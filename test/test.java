import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class test {
	public static void main(String[] args) {
		test t = new test();
	}

	test() {
		HashMap<String, String> string = new HashMap<String, String>();
		string.put("One", "Thing");
		string.put("Two", "Thing");
		HashMap<String, String> string2 = new HashMap<String, String>();
		string2.put("One", "Thing");
		string2.put("Two", "Thing");

Object[] s = string.keySet().toArray();
System.out.println(s[0]);


System.out.println(string.entrySet());
System.out.println(string.keySet());


		

	}
}
