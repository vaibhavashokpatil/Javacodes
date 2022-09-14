class Perfect
{
	static void countPerfect(int x , int y)		//for calculate the total count of perfect number
	{
		int count = 0;
		for(int i=x; i<=y; i++)
	{
		if(checkPerfect(i))
		{
		count = count +1;
		}
	}
	System.out.println("Total count of perfect number between " + x + " and " + y + " is : "+count);
 	}
		
//------------------------------------------------------------------------


static int greatest(int x, int y)       //to store the greatest value among two user input
{
	if(x==y)
	{
		return 0;
	}
	else if(x>y)
	{
		return x;
	}
	else
	{
		return y;
	}
}

//------------------------------------------------------------------------

static int lowest(int x, int y)         //to store the lowest value among two user input
{
	if(x==y)
	{
		return 0;
	}
	else if(x>y)
	{
		return y;
	}
	else
	{
		return x;
	}
}

//-------------------------------------------------------------------------

static boolean checkPerfect(int n)     //Logical Implementation To check number is Perfect or Not
	{
	int sum=0;
	for(int i = 1; i<n; i++)
	{
		if(n % i == 0)
		{
		sum = sum + i;
		}
	}
	if(n == sum) return true; return false;
	}

//---------------------------Main Method start--------------------------------

public static void main(String[] args)
{
java.util.Scanner sc = new java.util.Scanner(System.in);
System.out.println("Enter two Number ");

	int a = sc.nextInt();
	int b = sc.nextInt();

	int ll = lowest(a,b);
	int ul = greatest(a,b);

	countPerfect(ll,ul);
}
}

	