package strings;

import java.io.*;

public class ReverseAString {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String s1="";
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
		for(int i=s.length()-1;i>=0;i--)
		{
			s2+=s.charAt(i);
		}
		System.out.println(s2);
		br.close();
	}

}
