package strings;

import java.util.Scanner;

public class RemoveDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				continue;
			}
			s1+=s.charAt(i);
		}
		System.out.println(s1+s.charAt(s.length()-1));
		sc.close();
	}

}
