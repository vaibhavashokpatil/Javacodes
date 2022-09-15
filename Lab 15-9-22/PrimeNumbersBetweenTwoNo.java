import java.util.Scanner;
class PrimeNumbersBetweenTwoNo
{
	public static void main(String[] args)
	{
	int n1,n2,i,j;
	System.out.print("Enter Two Numbers ");
	Scanner sc= new Scanner(System.in);
	n1=sc.nextInt();
	n2=sc.nextInt();

	for(i=n1;i<=n2;i++)		//Outer loop
	{
		for(j=2;j<=i;j++)	//Inner loop
		{
			if(i%j==0)
			break;
		}
			if(i==j)
			System.out.print(j+ " ");
	}
	
	}
}