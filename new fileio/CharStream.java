import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;


class ReadWrite 
{
	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		FileReader fr = new FileReader("D:\\Cyber1.txt");
		FileWriter fw = new FileWriter("D:\\Success1.txt");

		int info;
		while((info=fr.read())!=-1);
		{
			System.out.println(info);
			fw.write(info);
		}
		fr.close();
		fw.close();
	}
}
