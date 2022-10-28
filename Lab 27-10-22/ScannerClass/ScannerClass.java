package corejava_eclipse;
import java.util.Scanner;
public class ScannerClass 
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int i=sc.nextInt();
		System.out.println(i);
		
		String s=sc.nextLine();
		System.out.println("s");
		
		double d=sc.nextDouble();
		System.out.println("d");
		
		boolean b=sc.nextBoolean();
		

	}

}
