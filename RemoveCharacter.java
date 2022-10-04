package strings;

import java.util.Scanner;

public class RemoveCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		char ch=sc.next().charAt(0);
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=ch)
				s1+=s.charAt(i);
		}
		System.out.println(s1);
		sc.close();
	}

}
