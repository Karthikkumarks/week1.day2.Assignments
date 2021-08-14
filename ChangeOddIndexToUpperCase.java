package week1.day2.assignments.strings;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "Changeme";
		
		char cha[]=test.toCharArray();
		String t="";
		
		for (int i=0;i<cha.length;i++)
		{
			if(i%2==0)
				cha[i]=Character.toUpperCase(cha[i]);
			t=t+cha[i];
		}
		System.out.println(t);

	}

}
