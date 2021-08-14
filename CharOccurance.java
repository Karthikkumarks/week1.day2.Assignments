package week1.day2.assignments.strings;

public class CharOccurance {
	public static void main(String args[]) {
		
		String str="welcome to chennai";
		
		int count=0;
		char c1[]=str.toCharArray();
		int l=c1.length;
		char c='e';
		for (int i=0;i<l;i++)
		{
			if(c1[i]==c)
				count=count+1;
			
		}
		System.out.println(count);
	}

}
