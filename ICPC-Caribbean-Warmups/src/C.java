import java.util.Arrays;
import java.util.Scanner;

public class C {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int numPersons = s.nextInt();

		int[] persons = new int[numPersons];

		for (int i=0; i<numPersons; i++) {
			persons[i] = s.nextInt();
		}

		Arrays.sort(persons);
		
		int minDif = numPersons * 24;
		for (int j=0; j<2; j++) {
			int totalDif = 0;
			int i = j;
			for (int counter=0; counter<numPersons-1; counter+=2) {
				int diff = Math.abs(persons[i] - persons[(i+1)%numPersons]);
				totalDif += Math.min(diff, 24-diff);
				i = (i + 2) % numPersons;
			}
			//System.out.println("Total Dif: "+totalDif);
			minDif = Math.min(minDif, totalDif);
		}

		System.out.println(minDif);
		
		s.close();

	}
}
