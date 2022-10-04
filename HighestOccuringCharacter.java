package strings;

import java.util.Scanner;

public class HighestOccuringCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int[] arr=new int[127];
		for(int i=0;i<s.length();i++)
		{
			arr[s.charAt(i)]=arr[s.charAt(i)]+1;
		}
		int max=0;
		char c=' ';
		for(int i=0;i<s.length();i++)
		{
			if(arr[s.charAt(i)]>max)
			{
				max=arr[s.charAt(i)];
				c=s.charAt(i);
			}
		}
		System.out.println(c);
		sc.close();
	}

}
