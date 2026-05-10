package krishnaprasath_assessment_3_2;

import java.util.*;

public class substring_concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str = sc.nextLine();
		if (str.length() >= 2) {
			System.out.print(str.substring(0, 2));
		} else if (str.length() == 0) {
			System.out.println("@@");
		} else {
			System.out.println(str.concat("@"));
		}
		sc.close();
	}

}
