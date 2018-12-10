import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class B {

	public static void main(String[] args) {

		Map<String, String> BToN = new HashMap<String, String>();

		String[] NToB= new String[10];
		NToB[0] = ".*"+"**"+"..";
		NToB[1] = "*."+".."+"..";
		NToB[2] = "*."+"*."+"..";
		NToB[3] = "**"+".."+"..";
		NToB[4] = "**"+".*"+"..";
		NToB[5] = "*."+".*"+"..";
		NToB[6] = "**"+"*."+"..";
		NToB[7] = "**"+"**"+"..";
		NToB[8] = "*."+"**"+"..";
		NToB[9] = ".*"+"*."+"..";

		for (int i=0; i<10; i++) {
			BToN.put(NToB[i], i+"");
		}

		Scanner s = new Scanner(System.in);

		int numDigits = s.nextInt();

		String[] msg = new String[numDigits];
		
		for (int i=0; i<numDigits; i++) {
			msg[i] = "";
		}

		for (int line=0; line<3; line++) {
			for (int i=0; i<numDigits; i++) {
				msg[i] = msg[i] + s.next();
			}
		}

		String result = "";
		for (int i=0; i<numDigits; i++) {
			result += BToN.get(msg[i]);
		}

		System.out.println(result);

	}

}
