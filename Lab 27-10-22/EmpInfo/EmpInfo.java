package corejava_eclipse;
import java.io.FileWriter;

public class EmpInfo 
{
	public static void main(String[] args) 
{
		try
		{
			int eid=23;
			String ename="Vaibhav";
			int sal=15000;
			
			FileWriter fw1 = new FileWriter("c:Empinfo.txt");
			fw1.write("Emp id:-"+eid+"Emp Name:-"+ename+"Salary:-"+sal);
			fw1.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
