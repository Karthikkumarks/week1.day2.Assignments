package week1.day2.assignments.strings;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1="stops";
		String text2="potss";
		
		if(text1.length()==text2.length())
		{
			char c1[]=text1.toCharArray();
			char c2[]=text2.toCharArray();
			int count=0;
			Arrays.sort(c1);
			Arrays.sort(c2);
			for (int i=0;i<c1.length;i++)
			{
				if(c1[i]==c2[i])
					count=count+1;
				else
					break;
			}
			if(count==c1.length)
				System.out.println("Anagram");
			else
				System.out.println("Not an Anagram");
		
		}
		else
			System.out.println("Not an Anagram");

	}

}
