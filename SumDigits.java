import java.util.Scanner;
class SumDigits
{
	public static void main(String[] args)
	{
		int x,y;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a digits: ");
		x=sc.nextInt();
		for(y=0; x!=0; x=x/10)
		{
			y = y+x%10;
		}
	System.out.print("sum of the number is: "+y);
	}
}