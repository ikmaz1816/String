package strings;

import java.util.Scanner;

public class AllSubstring {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				System.out.println(s.substring(i,j+1));
			}
		}
		sc.close();
	}

}
