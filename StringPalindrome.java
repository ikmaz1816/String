package strings;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		if(s1.equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}
