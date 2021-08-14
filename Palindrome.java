package week1.day2.assignments.strings;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		char[] charArray=str.toCharArray();
		for (int i=charArray.length-1; i>=0;i--)
		{
			
			rev=rev+charArray[i];
		}
		
		if(str.equals(rev))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrom");

	}

}
