package strings;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
		sc.close();
	}

}
