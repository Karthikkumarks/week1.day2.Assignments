package week1.day2.assignments.strings;

public class FindTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="$$ Welcome to 2nd Class of Automation $$";
		int letter=0,space=0,num=0,specialChar=0;
		char c[]=test.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(Character.isLetter(c[i]))
				letter=letter+1;
			else if(Character.isDigit(c[i]))
				num=num+1;
			else if(Character.isSpaceChar(c[i]))
				space=space+1;
			else
				specialChar=specialChar+1;
			
						
		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("SpecialCharacter: " + specialChar);
		

	}

}
