package corejava_eclipse;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		
		if(checkPalindrome(s))
		{
			System.out.println("It is Palindrome");
		}
		
		else
		{
			System.out.println("It is not Palindrome");
		}
		sc.close();
	}
		public static Boolean checkPalindrome(String s1)
		{
			int first = 0;
			int last = s1.length() -1;
		
		
			while(first<last)
			{
				if(s1.charAt(first) !=s1.charAt(last))
				{
					return false;
				}
				first++;
				last--;
			}
			return true;
		
		}

}
