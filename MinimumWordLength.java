package strings;

import java.util.Scanner;

public class MinimumWordLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int min=Integer.MAX_VALUE;
		int i=0,start=0,end=0,a=0,b=0;
		for(;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				end=i-1;
				int minimum=end-start;
				if(min>minimum)
				{
					min=minimum;
					a=start;
					b=end;
					
				}
				start=i+1;
			}
		}
		
		end=i-1;
		int minimum=end-start;
		if(min>minimum)
		{
			min=minimum;
			a=start;
			b=end;
			
		}
		
		System.out.println(s.substring(a,b+1));
		sc.close();
	}

}
