import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class A {

	public static void main(String[] args) {
		
		Set<Integer> angleSet = new HashSet<Integer>();
		
		for (int hr = 0; hr<360; hr+=30) {
			for (int min = hr; min< 360; min+=6) {
				int angle = min - hr;
				angleSet.add(angle);
			}
		}
		
		Scanner in = new Scanner(System.in);
		
		int inputAngle = in.nextInt();
		
		if (angleSet.contains(inputAngle)) {
			System.out.println("Y");
		}
		else {
			System.out.println("N");
		}
	}
}
