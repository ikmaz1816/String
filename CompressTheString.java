package strings;

import java.util.Scanner;

public class CompressTheString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String s1="";
		int count=1;
		for(int i=0;i<s.length()-1;i++)
		{
			if(s.charAt(i)==s.charAt(i+1))
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					s1=s1+s.charAt(i)+""+count;
				}
				else
				{
					s1=s1+s.charAt(i);
					
				}
				count=1;
			}
		}
		if(count!=1)
		{
			s1=s1+s.charAt(s.length()-1)+count;
		}
		else
		{
			s1=s1+s.charAt(s.length()-1);
		}
		System.out.println(s1);
		sc.close();
	}

}
