package week1.day2.assignments.strings;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="I am a software tester";
		String splitStr[]=test.split(" ");
		char[] revc=new char[test.length()];
		for(int i=0;i<splitStr.length;i++)
		{
			if(i%2==1)
			{
				char c[]=splitStr[i].toCharArray();
				
				for (int j=c.length-1;j>=0;j--)
				{
					
					 System.out.print(c[j]);
					
				}
				System.out.print(" ");
				
			}
		
		
			else
				System.out.print(splitStr[i] + " ");
		}

	}

}
