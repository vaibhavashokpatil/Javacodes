class Student
{
	public static void main(String[] args)
	{
	Student s1 = new Student("Vaibhav");
	Student s2 = new Student("Vaibhav",03);
	Student s3 = new Student("Vaibhav",03,"kalyan");
	s1.displayDataStudent();
	s2.displayDataStudent();
	s3.displayDataStudent();
	}
	
	String name;
	int rollno;
	String city;

	static String About = "info";

	Student(String n)
	{
	name = n;
	}
	Student(String n,int rno)
	{
	name = n;
	rollno = rno;
	}
	Student(String n,int rno,String c)
	{
	name = n;
	rollno = rno;
	city = c;
	}
	
	void displayDataStudent()
	{
	System.out.println("Name: " +name);
	System.out.println("rollno: " +rollno);
	System.out.println("City: " +city);
	}
}
	