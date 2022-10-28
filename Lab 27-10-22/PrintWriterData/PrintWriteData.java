package corejava_eclipse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
public class PrintWriteData 
{

	public static void main(String[] args) throws IOException
	{
		FileOutputStream out = new FileOutputStream("c:.Txt");
		PrintWriter pw = new PrintWriter(out);
		pw.println("Emp name:- Vaibhav");
		pw.println("Emp id:- 23");
		pw.println("Emp sal:- 15000");
		pw.close();
		System.out.println("Done");
	}

}
