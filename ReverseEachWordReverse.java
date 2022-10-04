package strings;

import java.util.Scanner;

public class ReverseEachWordReverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		String reverse="";
		int start=0,end=0,i=0;
		for(;i<s1.length();i++)
		{
			if(s1.charAt(i)==' ')
			{
				end=i-1;
				String rev="";
				for(int j=start;j<=end;j++)
				{
					rev=s1.charAt(j)+rev;
				}
				reverse+=rev+" ";
				start=i+1;
			}
		}
		end=i-1;
		String rev="";
		for(int j=start;j<=end;j++)
		{
			rev=s1.charAt(j)+rev;
		}
		reverse+=rev;
		System.out.println(reverse);
		
		sc.close();

	}

}
