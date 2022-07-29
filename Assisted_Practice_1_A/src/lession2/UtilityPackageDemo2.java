package lession2;
import java.util.StringTokenizer;
import java.util.Scanner;
public class UtilityPackageDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any sentence? ");
		String userString = sc.nextLine();
		StringTokenizer st = new StringTokenizer(userString, " ");
		System.out.println(st);
		System.out.println("\nVowels count for each word in given string are");
		while (st.hasMoreTokens()) {
			String word = st.nextToken();
			System.out.println("Processsing word: "+word);
			int vowelCount = 0;
			for(char c: word.toCharArray()) {
				c = Character.toLowerCase(c);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					vowelCount++;
				}
			}
			System.out.println("The word "+word+" has "+vowelCount+" vowels");
		}
		
		

	}

}
