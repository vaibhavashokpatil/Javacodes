import java.util.Scanner;
class PatternX
{
	public static void main(String[] args)
{
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter the no of lines: ");
	int lines = scan.nextInt();
	for(int i=1; i <= lines; i++)
	{
		for(int j=1; j <= lines; j++)
	{
		if((j == lines - i+1) || i == j)
	{
		System.out.print("*");
	}
		else
	{
		System.out.print(" ");
	}
}
		System.out.println("");
	}
	}
}
